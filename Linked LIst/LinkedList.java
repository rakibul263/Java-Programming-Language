public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {// * Time complexity -> O(1) */
        // step-01: create a new node
        Node newNode = new Node(data);

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-02: newNode = head
        newNode.next = head; // link

        // head = newNode
        head = newNode;
    }

    public void addLast(int data) { // * Time complexity -> O(1) */
        // create a new node
        Node newNode = new Node(data);

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // tail next = newNode;
        tail.next = newNode;

        // tail = newNode
        tail = newNode;

    }

    public void addAnyPosition(int index, int data) { // * Time complexity -> O(n) */
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // ! i==index-1 temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() { // * Time complexity -> O(n) */
        // ! base case
        if (head == null) {
            System.out.println("Linked List is NULL");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        System.out.println();
        System.out.println("After adding the element any of the position: ");
        ll.addAnyPosition(2, 300);
        ll.print();
    }
}
