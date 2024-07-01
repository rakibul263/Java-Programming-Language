public class Hellow_rectangular {
    public static void hellow(int totalRows, int totalCOl) {
        for (int row = 1; row <= totalRows; row++) {
            for (int col = 1; col <= totalCOl; col++) {
                if (row == 1 || row == totalRows || col == 1 || col == totalCOl) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hellow(4, 5);
    }
}
