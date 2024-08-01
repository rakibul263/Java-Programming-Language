public class key_find {
    public static void findKey(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            System.out.println("Key not found");
            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
            return;
        }
        findKey(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 7, 23, 65, 76, 23, 64 };
        int i = 0;
        int key = 3;
        findKey(arr, i, key);

    }
}
