// package Function;

import java.util.Scanner;

public class function_statement {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum is: " + sum(a, b));
        sc.close();
        ;
    }
}
