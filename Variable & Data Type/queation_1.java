
// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
import java.util.*;

public class queation_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}
