import java.util.*;

public class print_largest_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println("Largest A");
        } else if (b >= c) {
            System.out.println("Largest B");
        } else {
            System.out.println("Largest C");
        }
    }
}
