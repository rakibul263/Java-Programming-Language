import java.util.Scanner;

public class sum_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();

        float sum = a+b+c;
        float avg = sum/3;
        System.out.println(sum);
        System.out.println(avg);
    }
}
