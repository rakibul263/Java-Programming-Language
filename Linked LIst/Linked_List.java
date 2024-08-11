public class Linked_List {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
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
        tail = newNode;
    }

    public void addAnyPosition(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index > size - 1) {
            System.out.println("Please! Enter a valid Index");
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        int val = head.data;
        size--;
        head = head.next;
        return val;
    }

    public int removeLast() {
        int val = tail.data;
        Node temp = head;
        int i = 0;
        while (i < size - 2) {
            temp = temp.next;
        }
        temp.next = null;
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addAnyPosition(100, 100);

        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

    }
}
