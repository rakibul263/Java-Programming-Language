import java.util.*;

public class input {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        // input number
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // output
        System.out.println("Math: " + marks[0]);
        System.out.println("Phy : " + marks[1]);
        System.out.println("Chem: " + marks[2]);

        // update math marks
        marks[0] = 100;
        System.out.println("Math: " + marks[0]);
        sc.close();
    }
}
