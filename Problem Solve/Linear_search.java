// ! https://www.naukri.com/code360/problems/linear-search_624470?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube
public class Linear_search {

    public static int linearSearch(int arr[], int x) {
        // Your code goes here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}