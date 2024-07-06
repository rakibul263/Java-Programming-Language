import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort_desending {
    public static void main(String[] args) {
        Integer num[] = { 1, 5, 3, 2 };
        Arrays.sort(num, Collections.reverseOrder());
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
