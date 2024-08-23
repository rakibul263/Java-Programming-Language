public class Diameter_of_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return leftHeight + rightHeight + 1;
        }

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int seftDiameter = leftHeight + rightHeight + 1;

            return Math.max(seftDiameter, Math.max(leftDiameter, rightDiameter));
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, 9, 10, -1, -1, -1, -1, 5, 6, 7, -1, -1, -1, -1, 3, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println(bt.diameter(root));
    }
}
