import java.util.*;

public class priorityQueueV2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(4); // O(logN)
        pq.add(5);
        pq.add(1);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");// O(1)
            pq.remove();// O(logN)
        }
        System.out.println();
    }
}