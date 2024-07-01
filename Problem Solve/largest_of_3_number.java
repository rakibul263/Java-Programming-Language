import java.util.*;

public class largest_of_3_number {
    public static void main(String args[]) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}
