import java.util.*;

public class swapValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(45);
        list.add(23);

        Collections.swap(list, 0, 2);
        System.out.println(list);

    }
}
