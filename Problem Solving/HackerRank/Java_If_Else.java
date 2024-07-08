import java.util.*;

public class Java_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            // even
            if (number >= 2 && number <= 5) {
                System.out.println("Not Weird");
            } else if (number >= 6 && number <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            // odd
            System.out.println("Weird");
        }
    }
}