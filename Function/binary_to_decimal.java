public class binary_to_decimal {
    public static void btd(int binaryNumber) {
        int pow = 0;
        int decNum = 0;
        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binaryNumber /= 10;
        }
        System.out.println(decNum);
    }

    public static void main(String[] args) {

        btd(101);
    }
}
