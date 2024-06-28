public class printReverse {
    public static void main(String args[]) {
        int n = 108999;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
    }
}