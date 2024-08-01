public class optimized_power {
    // time complexity O(logN)
    public static int optimizedPower(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n / 2) * optimizedPower(x, n / 2);
        if (n % 2 != 0) {
            halfpower = x * halfpower;
        }
        return halfpower;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimizedPower(x, n));
    }
}
