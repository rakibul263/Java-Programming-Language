public class min_and_max_array {
    public static int setmini(int arr[]) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

    public static int setmax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 1, 9 };
        int n = arr.length;
        System.out.println("Minimum Value: " + setmini(arr));
        System.out.println("Maximum Value: " + setmax(arr));
    }
}
