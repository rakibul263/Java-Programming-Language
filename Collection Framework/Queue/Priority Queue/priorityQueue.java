import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add eleemt || min heap || small first and large last
        pq.offer(12);
        pq.offer(2);
        pq.offer(4);

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

    }
}
