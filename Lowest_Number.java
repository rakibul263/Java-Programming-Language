import java.util.Scanner;

/**
 * Lowest_Number
 */
public class Lowest_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (min > a) {
                min = a;
                idx = i + 1;
            }
        }
        System.out.println(min + " " + idx);
    }
}