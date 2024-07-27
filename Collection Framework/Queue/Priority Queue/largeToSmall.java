import java.util.*;

public class largeToSmall {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(4);
        pq.offer(1534);
        pq.offer(143);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
    }
}
