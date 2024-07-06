import java.util.Arrays;

public class inbuilt_sort_accending {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(num);
        printArray(num);
    }
}
