public class function_overloding {
    // sum of two number
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum fo three number ;
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int ans = sum(4, 5, 5);
        System.out.println(ans);
    }
}
