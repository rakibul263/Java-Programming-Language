import java.util.Scanner;

public class Easy_Fibonacci {

    // Recursive function to calculate the Fibonacci number at position n
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void printFibonacciSequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i));
            if (i < n) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printFibonacciSequence(N);
    }
}
