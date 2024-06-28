import java.util.*;

public class student_pass_or_fail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        String result = (mark >= 33) ? "pass" : "fail";
        System.out.println(result);
    }
}
