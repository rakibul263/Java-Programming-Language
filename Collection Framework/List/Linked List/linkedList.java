import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // remove from the list
        list.remove(2);
        System.out.println(list);

        list.add(4); // this will add 4 end of the list...
        System.out.println(list);

        list.add(1, 100);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(129);
        newList.add(263);

        list.addAll(newList);
        System.out.println(list);

        // position getting function
        System.out.println(list.get(1));

        // full list remove
        list.clear();
        System.out.println(list);

        System.out.println("Value increase of this specefic index :");
        List<Integer> increaseIndex = new ArrayList<>();
        increaseIndex.add(100);
        increaseIndex.add(200);
        increaseIndex.add(300);

        increaseIndex.set(1, 2000);
        System.out.println(increaseIndex);

        System.out.println(increaseIndex.contains(200));

        for (Integer element : increaseIndex) {
            System.out.println("The element is : " + element);
        }

    }
}
