import java.util.*;

public class sum_of_even_number_till_N {
    public static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s += i;
            }
        }
        return s;
    }

    public static void main(String args[]) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
}
