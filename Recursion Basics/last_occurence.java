public class last_occurence {
    public static void lastOc(int arr[], int i, int key) {
        if (i == 0) {
            System.out.println("Key not Found");
            return;
        }
        if (arr[i] == key) {
            System.out.println("Found! Index is : " + i);
            return;
        }
        lastOc(arr, i - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 54, 23, 54, 65, 34, 21, 54, 65 };
        int i = arr.length - 1;
        int key = 54;
        lastOc(arr, i, key);
    }
}
