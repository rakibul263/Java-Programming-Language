import java.util.*;

public class queue_using_two_stack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // ! empty method
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // ! add mehtod
        public static void add(int data) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.empty()) {
                s1.push(s2.pop());
            }
        }

        // ! remove method
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // ! peek mehtod
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
