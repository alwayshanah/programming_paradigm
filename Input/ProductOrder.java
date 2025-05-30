import java.util.Scanner;

public class ProductOrder {

    static class Product {
        String code;
        String description;
        double price;

        Product(String code, String description, double price) {
            this.code = code;
            this.description = description;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming a predefined product
        Product product = new Product("#001", "M1 Macbook Air", 63289.00);

        System.out.print("Enter Product Code: ");
        String inputCode = scanner.nextLine();
        
        if (!inputCode.equals(product.code)) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Description: ");
        String description = scanner.nextLine();
         
        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Price: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Quantity: ");
        int price = scanner.nextInt();
        
        System.out.print("Months to pay: ");
        int months = scanner.nextInt();
        
        System.out.print("%interest: ");
        double interest = scanner.nextDouble();
        
        double totalAmount = price * quantity;
        double interestAmount = totalAmount * (interest / 100);
        double monthlyAmount = (totalAmount + interestAmount) / months;

        System.out.println();
        System.out.println(product.code + " " + description);
        System.out.println("Ordered by " + customerName);
        System.out.println("Product price is " + product.price);
        System.out.printf("%.2f for %d months%n", monthlyAmount, months);
    }
}
