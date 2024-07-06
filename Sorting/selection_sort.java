public class selection_sort {
    public static void selection_sort_fun(int arra[]) {
        for (int i = 0; i < arra.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arra.length; j++) {
                if (arra[minPos] > arra[j]) {
                    minPos = j;
                }
            }
            int temp = arra[minPos];
            arra[minPos] = arra[i];
            arra[i] = temp;
        }
    }

    public static void print_selection_sort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selection_sort_fun(arr);
        print_selection_sort(arr);
    }
}
