import java.util.Scanner;

public class Binomial_Coefficient {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int bionomial(int n, int r) {
        int fact_N = fact(n);
        int fact_R = fact(r);
        int fact_NR = fact(n - r);
        int coeff = fact_N / (fact_R * fact_NR);
        return coeff;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = bionomial(n, r);
        System.out.println(result);
        sc.close();
    }
}
