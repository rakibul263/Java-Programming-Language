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
        public int peek(){
            return arr.get(0);
        }

        private void heapfify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIndex = i;

            if(left < arr.size() && arr.get(left) < arr.get(minIndex)){
                minIndex = left;
            }
            if(right < arr.size() && arr.get(right) < arr.get(minIndex)){
                minIndex = right;
            }

            if(minIndex != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapfify(minIndex);
            }

        }
        public int remove(){
            int data = arr.get(0);

            //step-01 1st and last node swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //delete last node
            arr.remove(arr.size()-1);

            //heapfify
            heapfify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {

    }
}
