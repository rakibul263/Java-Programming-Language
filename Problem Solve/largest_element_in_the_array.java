import java.util.*;

public class largest_element_in_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            arr.add(a);
        }
        int ans = Collections.max(arr);
        System.out.println(ans);
    }
}
