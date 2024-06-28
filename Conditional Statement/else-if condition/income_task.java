import java.util.Scanner;

public class income_task {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int task;
        if (income < 500000) {
            task = 0;
        } else if (income >= 500000 && income < 1000000) {
            task = (int) (income * 0.2);
        } else {
            task = (int) (income * 0.3);
        }
        System.out.println("Your task is : " + task);
    }
}
