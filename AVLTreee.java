import java.util.Scanner;

class AVLNode {
   int key, height;
   AVLNode left, right;

   AVLNode(int key) {
      this.key = key;
      this.height = 1;
   }
}

class AVLTree {
   private AVLNode root;

   private int height(AVLNode node) {
      return (node == null) ? 0 : node.height;
   }

   private int getBalance(AVLNode node) {
      return (node == null) ? 0 : height(node.left) - height(node.right);
   }

   private AVLNode rightRotate(AVLNode y) {
      AVLNode x = y.left;
      AVLNode T = x.right;
   
      x.right = y;
      y.left = T;
   
      y.height = Math.max(height(y.left), height(y.right)) + 1;
      x.height = Math.max(height(x.left), height(x.right)) + 1;
   
      return x;
   }

   private AVLNode leftRotate(AVLNode x) {
      AVLNode y = x.right;
      AVLNode T = y.left;
   
      y.left = x;
      x.right = T;
   
      x.height = Math.max(height(x.left), height(x.right)) + 1;
      y.height = Math.max(height(y.left), height(y.right)) + 1;
   
      return y; 
   }

   public void insert(int key) {
      root = insert(root, key);
   }

   private AVLNode insert(AVLNode node, int key) {
      if (node == null) 
         return new AVLNode(key);
   
      if (key < node.key)
         node.left = insert(node.left, key);
      else if (key > node.key)
         node.right = insert(node.right, key);
      else 
         return node;
   
      node.height = 1 + Math.max(height(node.left), height(node.right));
   
      int balance = getBalance(node);
   
      if (balance > 1 && key < node.left.key)
         return rightRotate(node);
   
      if (balance < -1 && key > node.right.key)
         return leftRotate(node);
   
      if (balance > 1 && key > node.left.key) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
      }
   
      if (balance < -1 && key < node.right.key) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
      }
   
      return node;
   }

   public void delete(int key) {
      root = delete(root, key);
   }

   private AVLNode delete(AVLNode node, int key) {
      if (node == null) 
         return node;
   
      if (key < node.key)
         node.left = delete(node.left, key);
      else if (key > node.key)
         node.right = delete(node.right, key);
      else {
         if ((node.left == null) || (node.right == null)) {
            AVLNode temp = (node.left != null) ? node.left : node.right;
            node = (temp != null) ? temp : null;
         } else {
            AVLNode temp = getMinValueNode(node.right);
            node.key = temp.key;
            node.right = delete(node.right, temp.key);
         }
      }
   
      if (node == null) 
         return node;
   
      node.height = Math.max(height(node.left), height(node.right)) + 1;
      int balance = getBalance(node);
   
      if (balance > 1 && getBalance(node.left) >= 0)
         return rightRotate(node);
   
      if (balance > 1 && getBalance(node.left) < 0) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
      }
   
      if (balance < -1 && getBalance(node.right) <= 0)
         return leftRotate(node);
   
      if (balance < -1 && getBalance(node.right) > 0) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
      }
   
      return node;
   }

   private AVLNode getMinValueNode(AVLNode node) {
      AVLNode current = node;
      while (current.left != null)
         current = current.left;
      return current;
   }

   public boolean search(int key) {
      return search(root, key);
   }

   private boolean search(AVLNode node, int key) {
      if (node == null) 
         return false;
   
      if (key < node.key)
         return search(node.left, key);
      else if (key > node.key)
         return search(node.right, key);
      else
         return true;
   }

   public int getMin() {
      AVLNode current = root;
      while (current != null && current.left != null)
         current = current.left;
      return (current != null) ? current.key : Integer.MIN_VALUE;
   }

   public int getMax() {
      AVLNode current = root;
      while (current != null && current.right != null)
         current = current.right;
      return (current != null) ? current.key : Integer.MAX_VALUE;
   }

   public int getHeight() {
      return height(root);
   }

   public void printInOrder() {
      inOrder(root);
      System.out.println();
   }

   private void inOrder(AVLNode node) {
      if (node != null) {
         inOrder(node.left);
         System.out.print(node.key + " ");
         inOrder(node.right);
      }
   }

   public void printPreOrder() {
      preOrder(root);
      System.out.println();
   }

   private void preOrder(AVLNode node) {
      if (node != null) {
         System.out.print(node.key + " ");
         preOrder(node.left);
         preOrder(node.right);
      }
   }

   public void printPostOrder() {
      postOrder(root);
      System.out.println();
   }

   private void postOrder(AVLNode node) {
      if (node != null) {
         postOrder(node.left);
         postOrder(node.right);
         System.out.print(node.key + " ");
      }
   }
}

public class AVLTreee {
   public static void main(String[] args) {
      AVLTree tree = new AVLTree();
      Scanner scanner = new Scanner(System.in);
   
      while (true) {
         System.out.println("AVL Tree Interface");
         System.out.print("\nInOrder:");
         tree.printInOrder();
         System.out.print("PreOrder:");
         tree.printPreOrder();
         System.out.print("PostOrder:");
         tree.printPostOrder();
         System.out.println("\nMin: " + tree.getMin());
         System.out.println("Max: " + tree.getMax());
         System.out.println("Height: " + tree.getHeight());
         System.out.println("\n(I)NSERT  (S)EARCH  (R)EMOVE  E(X)IT");
      
         System.out.print("Choose an option: ");
         char choice = scanner.next().toUpperCase().charAt(0);
         if (choice == 'I') {
            System.out.print("Enter key to insert: ");
            int key = scanner.nextInt();
            tree.insert(key);
         } else if (choice == 'S') {
            System.out.print("Enter key to search: ");
            int key = scanner.nextInt();
            System.out.println("Key " + key + " is " + (tree.search(key) ? "found" : "not found"));
         } else if (choice == 'R') {
            System.out.print("Enter key to remove: ");
            int key = scanner.nextInt();
            tree.delete(key);
         } else if (choice == 'X') {
            System.out.println("Exiting...");
            break;
         } else {
            System.out.println("Invalid choice. Try again.");
         }
      }
   
      scanner.close();
   }
}
