/**
 * Created by Flo on 22-Feb-16.
 */
public class BinaryTree {

    static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void addNode(Node node, int value) {
        if (value > node.value) {
            if (node.right != null)
                addNode(node.right, value);
            else {
                node.right = new Node(value);
            }
        }
        else {
            if (node.left != null)
                addNode(node.left, value);
            else {
                node.left = new Node(value);
            }
        }
    }

    public static void showInOrder(Node node) {
        if (node.left != null)
            showInOrder(node.left);
        System.out.println(node.value);
        if (node.right != null)
            showInOrder(node.right);
    }

    public static void showPreOrder(Node node) {
        System.out.println(node.value);
        if (node.left != null)
            showPreOrder(node.left);
        if (node.right != null)
            showPreOrder(node.right);
    }

    public static void showPostOrder(Node node) {
        if (node.left != null)
            showPostOrder(node.left);
        if (node.right != null)
            showPostOrder(node.right);
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        addNode(root, 1);
        addNode(root, 8);
        addNode(root, 6);
        addNode(root, 3);
        addNode(root, 9);
        showInOrder(root);
    }
}
