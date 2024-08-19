import java.util.*;

public class Queue_using_JCF_2 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
    }
}
