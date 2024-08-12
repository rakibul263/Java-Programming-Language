import java.util.LinkedList;

public class LinkedListCollectionF {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        //? remove last
        ll.removeLast();
        System.out.println(ll);

    }
}