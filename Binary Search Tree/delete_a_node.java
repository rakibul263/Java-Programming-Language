public class delete_a_node {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else if(root.data<val){
            root.right = insert(root.right, val)l
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
