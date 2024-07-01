public class binary_to_decimal {
    public static void binary_to_decimal(int binaryNumber) {
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
        binary_to_decimal(111);
    }
}
