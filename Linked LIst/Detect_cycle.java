// floyd's cycle algorithm

public class Detect_cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // ! +1
            fast = fast.next.next; // ! +2
            if (slow == fast) {
                return true; // cycle exist
            }
        }
        return false; // cycle not found
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // ? 1->2->3->1
        if (isCycle()) {
            System.out.println("Cycle Found");
        } else {
            System.out.println("Cycle Not Found");
        }
    }
}
