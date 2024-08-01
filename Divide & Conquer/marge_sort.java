
public class marge_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void margeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        margeSort(arr, si, mid); // left part
        margeSort(arr, mid + 1, ei);// right part
        marge(arr, si, mid, ei);
    }

    public static void marge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;// iterator for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy to my original array
        for (k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        margeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

}
