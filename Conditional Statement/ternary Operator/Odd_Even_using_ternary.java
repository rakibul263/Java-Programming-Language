import java.util.*;

public class Odd_Even_using_ternary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String check = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(check);
    }
}
