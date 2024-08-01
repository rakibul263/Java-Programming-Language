import java.util.*;

public class increasing_order {
    public static void increasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        increasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        increasing(num);
    }
}
