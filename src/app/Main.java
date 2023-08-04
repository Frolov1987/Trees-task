package app;

public class Main {
    Node root;

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
        tree.root.getLeft().setLeft(new Node(4));
        tree.root.getRight().setRight(new Node(5));
        tree.root.getLeft().getLeft().setLeft(new Node(6));
        tree.root.getRight().getRight().setRight(new Node(7));
        tree.root.getLeft().getLeft().getLeft().setLeft(new Node(8));
        tree.root.getRight().getRight().getRight().setRight(new Node(9));
        tree.root.getLeft().getLeft().getLeft().getLeft().setLeft(new Node(10));
        tree.root.getRight().getRight().getRight().getRight().setRight(new Node(11));
        tree.root.getLeft().getLeft().getLeft().getLeft().getLeft().setLeft(new Node(12));

        System.out.print("Inorder traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPreorder traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nPostorder traversal: ");
        tree.traversePostOrder(tree.root);
    }

    private Main() {
        root = null;
    }

    private void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.print(" " + node.getKey());
            traverseInOrder(node.getRight());
        }
    }
    private void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.getKey());
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }
    private void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(" " + node.getKey());
        }
    }
}

