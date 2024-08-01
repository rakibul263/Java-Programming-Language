
public class sorted {
    public static boolean isSorted(int arr[], int n) {
        if (n == 0) {
            return true;
        }
        if (arr[n] < arr[n - 1]) {
            return false;
        }
        return isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 7 };
        int len = arr.length - 1;
        System.out.println(isSorted(arr, len));
    }
}
