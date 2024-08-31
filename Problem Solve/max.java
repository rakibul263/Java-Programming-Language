import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max = Integer.MIN_VALUE;
        while (t-- > 0) {
            int a = sc.nextInt();
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}
