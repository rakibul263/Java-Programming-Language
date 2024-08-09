import java.util.ArrayList;
import java.util.Scanner;

public class monotonicArraylist {
    public static boolean Monotonic(ArrayList<Integer> list, int size) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < size - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the value of the element: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println(Monotonic(list, n));

    }
}
