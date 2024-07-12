import java.util.Scanner;

public class product_two_number {
    public static int multi(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multi(a, b);
        System.out.println(result);
        sc.close();
    }
}
