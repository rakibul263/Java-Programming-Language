import java.util.*;

public class priorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(4);
        pq.add(5);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();
    }
}
