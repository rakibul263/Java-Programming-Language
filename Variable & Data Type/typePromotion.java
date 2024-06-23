import java.util.Scanner;

public class typePromotion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        float b = 4.5f;
        double c = 5.43;
        int ans = (int) (a + b + c);
        System.out.println(ans);
    }
}
