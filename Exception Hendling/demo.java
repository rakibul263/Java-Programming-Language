public class demo {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Not allowed");
        } finally {
            System.out.println("All time print this line");
        }
    }
}
