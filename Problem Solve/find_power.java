import java.util.Scanner;

public class find_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        // int ans = Math.pow((int) x, n);
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= x;
        }
        System.out.println(ans);
    }
}
