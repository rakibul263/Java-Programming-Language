import java.util.*;

// queue flow first in first out 
public class linkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // for element add
        queue.offer(12);
        queue.offer(23);
        queue.offer(35);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
