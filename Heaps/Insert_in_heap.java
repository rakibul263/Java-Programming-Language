import java.util.ArrayList;

public class Insert_in_heap {
    static class Heap {
        ArrayList<Integer>arr = new ArrayList<>();

        public void add(int data){
            //add last
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x)<arr.get(par)){ // O(logN)
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }
    }
    public static void main(String[] args) {

    }
}
