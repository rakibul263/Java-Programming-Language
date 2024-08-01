import java.util.*;

public class sum {
    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = Sum(num);
        System.out.println(ans);
    }
}
