import java.util.*;

public class print_1toN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
    }
}
