import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// [1] Staff Class to store staff info
class Staff implements Serializable {
   String staffID;
   String staffName;
   String password;

   public Staff(String staffID, String staffName, String password) {
      this.staffID = staffID;
      this.staffName = staffName;
      this.password = password;
   }
}
class Item {
    private String brand;
    private LocalDate expiryDate;

    public Item(String brand, LocalDate expiryDate) {
        this.brand = brand;
        this.expiryDate = expiryDate;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Expiry: " + expiryDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}


// [2] Represents an inventory item
class InventoryItem implements Serializable {
   String itemName;
   String brand;
   String purchasedDate;
   String expirationDate;
   String recipe;
   String notes;
   int maxQuantity;
   int remainingQuantity;
   String disposalMethod;

   public InventoryItem(String itemName, String brand, String purchasedDate, String expirationDate,
                         String recipe, String notes, int maxQuantity, int remainingQuantity, String disposalMethod) {
      this.itemName = itemName;
      this.brand = brand;
      this.purchasedDate = purchasedDate;
      this.expirationDate = expirationDate;
      this.recipe = recipe;
      this.notes = notes;
      this.maxQuantity = maxQuantity;
      this.remainingQuantity = remainingQuantity;
      this.disposalMethod = disposalMethod;
   }

   @Override
   public String toString() {
      return "Item Name: " + itemName + "\n" +
             "Brand: " + brand + "\n" +
             "Purchased Date: " + purchasedDate + "\n" +
             "Expiration Date: " + expirationDate + "\n" +
             "Recipe: " + recipe + "\n" +
             "Notes: " + notes + "\n" +
             "Max Quantity: " + maxQuantity + "\n" +
             "Remaining Quantity: " + remainingQuantity + "\n" +
             "Disposal Method: " + disposalMethod;
   }
}

// [3] Binary Search Tree (BST) Node
class Node implements Serializable {
   InventoryItem item;
   Node left;
   Node right;

   public Node(InventoryItem item) {
      this.item = item;
      this.left = this.right = null;
   }
}

// [4] Binary Search Tree (BST)
class BinarySearchTree implements Serializable {
   private Node root;

   public BinarySearchTree() {
      root = null;
   }

   public void insert(InventoryItem item) {
      root = insertRecursive(root, item);
   }

   private Node insertRecursive(Node root, InventoryItem item) {
      if (root == null) {
         return new Node(item);
      }
      if (item.itemName.compareTo(root.item.itemName) < 0) {
         root.left = insertRecursive(root.left, item);
      } else if (item.itemName.compareTo(root.item.itemName) > 0) {
         root.right = insertRecursive(root.right, item);
      }
      return root;
   }

   public InventoryItem search(String itemName) {
      return searchRecursive(root, itemName);
   }

   private InventoryItem searchRecursive(Node root, String itemName) {
      if (root == null || root.item.itemName.equalsIgnoreCase(itemName)) {
         return root != null ? root.item : null;
      }
      if (itemName.compareTo(root.item.itemName) < 0) {
         return searchRecursive(root.left, itemName);
      } else {
         return searchRecursive(root.right, itemName);
      }
   }

   public boolean delete(String itemName) {
      root = deleteRecursive(root, itemName);
      return root != null;
   }

   private Node deleteRecursive(Node root, String itemName) {
      if (root == null) {
         return null;
      }
      if (itemName.compareTo(root.item.itemName) < 0) {
         root.left = deleteRecursive(root.left, itemName);
      } else if (itemName.compareTo(root.item.itemName) > 0) {
         root.right = deleteRecursive(root.right, itemName);
      } else {
         if (root.left == null) {
            return root.right;
         } else if (root.right == null) {
            return root.left;
         }
         root.item = minValueNode(root.right).item;
         root.right = deleteRecursive(root.right, root.item.itemName);
      }
      return root;
   }

   private Node minValueNode(Node root) {
      Node current = root;
      while (current.left != null) {
         current = current.left;
      }
      return current;
   }

   public List<InventoryItem> inOrderTraversal() {
      List<InventoryItem> itemList = new ArrayList<>();
      inOrderRecursive(root, itemList);
      return itemList;
   }

   private void inOrderRecursive(Node root, List<InventoryItem> itemList) {
      if (root != null) {
         inOrderRecursive(root.left, itemList);
         itemList.add(root.item);
         inOrderRecursive(root.right, itemList);
      }
   }
}

// [5] Inventory Manager using HashMap for categories
class InventoryManager implements Serializable {
   private Map<String, BinarySearchTree> categoryMap = new HashMap<>();
   private HashMap<String, Staff> staffDirectory = new HashMap<>();
   private ArrayList<Item> items;

   public InventoryManager() {
   items = new ArrayList<>();
      loadData();
   
      if (categoryMap.isEmpty()) {
         categoryMap.put("Pantry", new BinarySearchTree());
         categoryMap.put("Fridge", new BinarySearchTree());
      }
   
      if (staffDirectory.isEmpty()) {
         staffDirectory.put("1001", new Staff("1001", "John Doe", "xianni"));
         staffDirectory.put("1002", new Staff("1002", "Jane Smith", "password"));
         staffDirectory.put("1003", new Staff("1003", "Alice Johnson", "mememe"));
      }
   }
   
   public void loadData() {
      File staffFile = new File("staffData.ser");
      File inventoryFile = new File("inventoryData.ser");
   
      try {
         if (staffFile.exists()) {
            try (ObjectInputStream staffStream = new ObjectInputStream(new FileInputStream(staffFile))) {
               staffDirectory = (HashMap<String, Staff>) staffStream.readObject();
            }
         } else {
            System.out.println("No previous staff data found. Using default.");
         }
      
         if (inventoryFile.exists()) {
            try (ObjectInputStream inventoryStream = new ObjectInputStream(new FileInputStream(inventoryFile))) {
               categoryMap = (HashMap<String, BinarySearchTree>) inventoryStream.readObject();
            }
         } else {
            System.out.println("No previous inventory data found. Using default.");
         }
        
      } catch (Exception e) {
         System.out.println("Error loading data: " + e.getMessage());
      }
   }

   public void saveData() {
      try (ObjectOutputStream staffOut = new ObjectOutputStream(new FileOutputStream("staffData.ser"));
         ObjectOutputStream inventoryOut = new ObjectOutputStream(new FileOutputStream("inventoryData.ser"))) {
        
         staffOut.writeObject(staffDirectory);
        
         inventoryOut.writeObject(categoryMap);
      } catch (IOException e) {
         JOptionPane.showMessageDialog(null, "Error saving data: " + e.getMessage());
      }
   }
   
   public boolean validateLogin(String staffID, String password) {
      Staff staff = staffDirectory.get(staffID);
      if (staff != null && staff.password.equals(password)) {
         return true;
      }
      return false;
   }
   
   // Add a new item to a category
   public void addItem(String category) {
      JTextField itemNameField = new JTextField();
      JTextField brandField = new JTextField();
      JTextField purchasedDateField = new JTextField();
      JTextField expirationDateField = new JTextField();
      JTextField recipeField = new JTextField();
      JTextField notesField = new JTextField();
      JTextField maxQuantityField = new JTextField();
      JTextField remainingQuantityField = new JTextField();
      JTextField disposalMethodField = new JTextField();
   
      JPanel panel = new JPanel(new GridLayout(9, 2)); // Layout to show fields in grid format
      panel.add(new JLabel("Item Name:"));
      panel.add(itemNameField);
      panel.add(new JLabel("Brand:"));
      panel.add(brandField);
      panel.add(new JLabel("Purchased Date (yyyy-mm-dd):"));
      panel.add(purchasedDateField);
      panel.add(new JLabel("Expiration Date (yyyy-mm-dd):"));
      panel.add(expirationDateField);
      panel.add(new JLabel("Recipe:"));
      panel.add(recipeField);
      panel.add(new JLabel("Notes:"));
      panel.add(notesField);
      panel.add(new JLabel("Max Quantity:"));
      panel.add(maxQuantityField);
      panel.add(new JLabel("Remaining Quantity:"));
      panel.add(remainingQuantityField);
      panel.add(new JLabel("Disposal Method:"));
      panel.add(disposalMethodField);
   
      int option = JOptionPane.showConfirmDialog(null, panel, "Enter Item Details", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
   
      if (option == JOptionPane.OK_OPTION) {
         String itemName = itemNameField.getText();
         String brand = brandField.getText();
         String purchasedDate = purchasedDateField.getText();
         String expirationDate = expirationDateField.getText();
         String recipe = recipeField.getText();
         String notes = notesField.getText();
         int maxQuantity = Integer.parseInt(maxQuantityField.getText());
         int remainingQuantity = Integer.parseInt(remainingQuantityField.getText());
         String disposalMethod = disposalMethodField.getText();
      
         InventoryItem item = new InventoryItem(itemName, brand, purchasedDate, expirationDate,
                                                 recipe, notes, maxQuantity, remainingQuantity, disposalMethod);
      
         // Display the entered item details
         JOptionPane.showMessageDialog(null, "Item Details:\n" + item.toString());
      
         // Add the item to the correct category tree
         BinarySearchTree tree = categoryMap.get(category);
         if (tree != null) {
            tree.insert(item);
         }
      
         JOptionPane.showMessageDialog(null, "Item added successfully!\n");
      }
   }

   // Remove an item from a category
   public void removeItem(String category) {
      String itemName = JOptionPane.showInputDialog("Enter the name of the item to remove:");
      BinarySearchTree tree = categoryMap.get(category);
        
      InventoryItem item = tree.search(itemName);
      if (item != null) {
         // Display item details before confirmation
         int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove the following item?\n" + item.toString(),
                                                     "Confirm Deletion", JOptionPane.YES_NO_OPTION);
         if (confirm == JOptionPane.YES_OPTION) {
            if (tree.delete(itemName)) {
               JOptionPane.showMessageDialog(null, "Item removed successfully!\n");
            }
         } else {
            JOptionPane.showMessageDialog(null, "Item removal canceled.");
         }
      } else {
         JOptionPane.showMessageDialog(null, "Item not found.\n");
      }
   }

   // Edit an item in a category
   public void editItem(String category) {
      String itemName = JOptionPane.showInputDialog("Enter the name of the item to edit:");
      BinarySearchTree tree = categoryMap.get(category);
    
      InventoryItem item = tree.search(itemName);
      if (item != null) {
         JTextField brandField = new JTextField(item.brand);
         JTextField purchasedDateField = new JTextField(item.purchasedDate);
         JTextField expirationDateField = new JTextField(item.expirationDate);
         JTextField recipeField = new JTextField(item.recipe);
         JTextField notesField = new JTextField(item.notes);
         JTextField maxQuantityField = new JTextField(String.valueOf(item.maxQuantity));
         JTextField remainingQuantityField = new JTextField(String.valueOf(item.remainingQuantity));
         JTextField disposalMethodField = new JTextField(item.disposalMethod);
      
         JPanel panel = new JPanel(new GridLayout(9, 2));
         panel.add(new JLabel("Brand:"));
         panel.add(brandField);
         panel.add(new JLabel("Purchased Date (yyyy-mm-dd):"));
         panel.add(purchasedDateField);
         panel.add(new JLabel("Expiration Date (yyyy-mm-dd):"));
         panel.add(expirationDateField);
         panel.add(new JLabel("Recipe:"));
         panel.add(recipeField);
         panel.add(new JLabel("Notes:"));
         panel.add(notesField);
         panel.add(new JLabel("Max Quantity:"));
         panel.add(maxQuantityField);
         panel.add(new JLabel("Remaining Quantity:"));
         panel.add(remainingQuantityField);
         panel.add(new JLabel("Disposal Method:"));
         panel.add(disposalMethodField);
      
         int option = JOptionPane.showConfirmDialog(null, panel, "Edit Item Details", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
      
         if (option == JOptionPane.OK_OPTION) {
            item.brand = brandField.getText();
            item.purchasedDate = purchasedDateField.getText();
            item.expirationDate = expirationDateField.getText();
            item.recipe = recipeField.getText();
            item.notes = notesField.getText();
            item.maxQuantity = Integer.parseInt(maxQuantityField.getText());
            item.remainingQuantity = Integer.parseInt(remainingQuantityField.getText());
            item.disposalMethod = disposalMethodField.getText();
         
            // Display edited item details before confirming the update
            JOptionPane.showMessageDialog(null, "Item updated. New details:\n" + item.toString());
         }
      } else {
         JOptionPane.showMessageDialog(null, "Item not found.\n");
      }
   }

   // Display items of a category
   public void displayItems(String category) {
      BinarySearchTree tree = categoryMap.get(category);
      List<InventoryItem> categoryItems = tree.inOrderTraversal();
        
      if (categoryItems.isEmpty()) {
         JOptionPane.showMessageDialog(null, "No items in " + category + ".\n");
      } else {
         StringBuilder itemsList = new StringBuilder("Items in " + category + ":\n");
         for (InventoryItem item : categoryItems) {
            itemsList.append(item).append("\n-----\n");
         }
         JOptionPane.showMessageDialog(null, itemsList.toString());
      }
   }
      
      public void searchItems(String brand, int expiryMonths) {
        ArrayList<Item> results = new ArrayList<>(); // Temporary list for search results
        LocalDate targetDate = LocalDate.now().plusMonths(expiryMonths); // Expiry threshold

        for (Item item : items) { // Iterate over all items
            boolean matchesBrand = (brand == null || brand.isEmpty() || item.getBrand().equalsIgnoreCase(brand));
            boolean matchesExpiry = (expiryMonths == -1 || item.getExpiryDate().isBefore(targetDate));

            if (matchesBrand && matchesExpiry) {
                results.add(item);
            }
        }

        // Display results
        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No matching items found.", "Search Results", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder resultString = new StringBuilder("Matching Items:\n");
            for (Item item : results) {
                resultString.append(item).append("\n");
            }
            JOptionPane.showMessageDialog(null, resultString.toString(), "Search Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Sample addItem method to populate the list (for testing)
    public void addItem(String brand, LocalDate expiryDate) {
        items.add(new Item(brand, expiryDate));
    }
}
    // [6] Main GUI Class
public class InventoryGUI {
   public static void main(String[] args) {
      InventoryManager manager = new InventoryManager();
   
      String staffID = JOptionPane.showInputDialog(null, "Enter Staff ID:", "Input", JOptionPane.QUESTION_MESSAGE);
   
      JPasswordField passwordField = new JPasswordField();
      Object[] message = {
            "Enter Password:", passwordField
         };
   
      int option = JOptionPane.showConfirmDialog(
            null, 
            message, 
            "Input", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
         );
   
      if (option != JOptionPane.OK_OPTION) {
         JOptionPane.showMessageDialog(null, "Login canceled. Exiting the program.");
         System.exit(0);
      }
   
      String password = new String(passwordField.getPassword());
   
      if (manager.validateLogin(staffID, password)) {
         JOptionPane.showMessageDialog(null, "Login successful.");
         displayMenu(manager);
      } else {
         JOptionPane.showMessageDialog(null, "Invalid Staff ID or Password! Exiting the program.");
         System.exit(0);
      }
   
      manager.saveData();
   }
    
   // Display the inventory management menu
   public static void displayMenu(InventoryManager manager) {
    String[] options = {"Add Item to Pantry", "Add Item to Fridge", "Remove Item from Pantry", 
                        "Remove Item from Fridge", "Edit Item in Pantry", "Edit Item in Fridge", 
                        "View Pantry Items", "View Fridge Items", "Search Items"};
    
    while (true) {
        int choice = JOptionPane.showOptionDialog(
            null, 
            "Choose an option", 
            "Inventory Management System", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            options, 
            options[0]);
        
        switch (choice) {
            case 0:
                manager.addItem("Pantry");
                break;
            case 1:
                manager.addItem("Fridge");
                break;
            case 2:
                manager.removeItem("Pantry");
                break;
            case 3:
                manager.removeItem("Fridge");
                break;
            case 4:
                manager.editItem("Pantry");
                break;
            case 5:
                manager.editItem("Fridge");
                break;
            case 6:
                manager.displayItems("Pantry");
                break;
            case 7:
                manager.displayItems("Fridge");
                break;
            case 8: // New "Search Items" case
                String brand = JOptionPane.showInputDialog(null, "Enter Brand Name (or leave blank):", "Search Items", JOptionPane.QUESTION_MESSAGE);
                String expiryInput = JOptionPane.showInputDialog(null, "Enter Expiry Duration in Months (or leave blank):", "Search Items", JOptionPane.QUESTION_MESSAGE);
                
                int expiryMonths = expiryInput != null && !expiryInput.trim().isEmpty() ? Integer.parseInt(expiryInput) : -1;
                manager.searchItems(brand, expiryMonths);
                break;
            default:
                manager.saveData();
                JOptionPane.showMessageDialog(null, "Closing Program...");
                System.exit(0);
        }
    }
}
}

