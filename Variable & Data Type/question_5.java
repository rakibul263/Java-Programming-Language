
// Question 4: What will be the type of result in the following Java code?
// import java.util.*;

public class question_5 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
