import java.util.*;

public class priorityQueueReverseOrder {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(6);
        pq.add(54);
        pq.add(2);
        pq.add(66);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();
    }
}
