public class floyds_triangle {
    public static void triangle(int n) {
        int count = 1;
        // row
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(5);
    }
}
