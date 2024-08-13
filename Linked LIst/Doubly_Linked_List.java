public class Doubly_Linked_List {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ! add Method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAnyPosition(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        } else if (index > size + 1) {
            System.out.println("Please! enter a valid index");
            return;
        } else if (index == size + 1) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // ! remove method
    public void removeFirst() {
        if (head == null) {
            System.out.println("Doubly linked list empty");
            return;
        }
        head = head.next;
        head.next.prev = null;
        size--;
    }

    public void removeLast() {
        tail = tail.prev;
        tail.prev.next = null;
        size--;
    }

    public void removeAnyPosition(int index) {
        // * base case
        if (index == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
        }
        size--;
        temp.next = temp.next.next;
        temp.next.next.prev = temp;
    }

    // ! print method
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Doubly_Linked_List ll = new Doubly_Linked_List();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        // ll.addAnyPosition(6, 100);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();

        ll.print();
        ll.removeAnyPosition(1);
        ll.print();

        System.out.println("Size: " + ll.size);
    }
}
