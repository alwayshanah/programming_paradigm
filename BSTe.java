import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}

class BST {
    private Node root;

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }

    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(Node node, int key) {
        if (node == null)
            return false;
        if (key == node.key)
            return true;
        if (key < node.key)
            return search(node.left, key);
        else
            return search(node.right, key);
    }

    public void remove(int key) {
        root = remove(root, key);
    }

    private Node remove(Node node, int key) {
        if (node == null)
            return null;

        if (key < node.key) {
            node.left = remove(node.left, key);
        } else if (key > node.key) {
            node.right = remove(node.right, key);
        } else {
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;

            Node minLargerNode = minValueNode(node.right);
            node.key = minLargerNode.key;
            node.right = remove(node.right, minLargerNode.key);
        }
        return node;
    }

    public int findMin() {
        Node minNode = minValueNode(root);
        return (minNode != null) ? minNode.key : Integer.MIN_VALUE;
    }

    private Node minValueNode(Node node) {
        while (node != null && node.left != null)
            node = node.left;
        return node;
    }

    public int findMax() {
        Node maxNode = maxValueNode(root);
        return (maxNode != null) ? maxNode.key : Integer.MAX_VALUE;
    }

    private Node maxValueNode(Node node) {
        while (node != null && node.right != null)
            node = node.right;
        return node;
    }

    public int getHeight() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }
}

public class BSTe {
    public static void main(String[] args) {
        BST tree = new BST();
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nBST");
            System.out.print("\nInOrder: ");
            tree.inOrder();
            System.out.print("PreOrder: ");
            tree.preOrder();
            System.out.print("PostOrder: ");
            tree.postOrder();
            System.out.println("\nMin: " + (tree.findMin() == Integer.MIN_VALUE ? "N/A" : tree.findMin()));
            System.out.println("Max: " + (tree.findMax() == Integer.MAX_VALUE ? "N/A" : tree.findMax()));
            System.out.println("Height: " + tree.getHeight());

            System.out.println("\n(I)NSERT  (S)EARCH  (R)EMOVE  E(X)IT");
            System.out.print("Choose an option: ");
            choice = Character.toUpperCase(scanner.next().charAt(0));

            switch (choice) {
                case 'I':
                    System.out.print("Enter a value to insert: ");
                    int insertValue = scanner.nextInt();
                    tree.insert(insertValue);
                    System.out.println("Value inserted.");
                    break;

                case 'S':
                    System.out.print("Enter a value to search: ");
                    int searchValue = scanner.nextInt();
                    if (tree.search(searchValue))
                        System.out.println("Value found.");
                    else
                        System.out.println("Value not found.");
                    break;

                case 'R':
                    System.out.print("Enter a value to remove: ");
                    int removeValue = scanner.nextInt();
                    tree.remove(removeValue);
                    System.out.println("Value removed.");
                    break;

                case 'X':
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 'X');

        scanner.close();
    }
}
