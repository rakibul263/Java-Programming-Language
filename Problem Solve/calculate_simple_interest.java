import java.util.*;

public class calculate_simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();

        float interest = principle * rate * time / 100;

        System.out.println((int) interest);
    }
}
