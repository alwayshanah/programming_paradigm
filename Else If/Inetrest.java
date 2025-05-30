import java.util.Scanner;

public class Inetrest {
   public static void main (String [] args) {
   
   Scanner a = new Scanner (System.in);
   Scanner b = new Scanner (System.in);
   
   System.out.print("Product ID: ");
   String productId = a.nextLine();
   System.out.print("Description: ");
   String description = a.nextLine();
   System.out.print("Price: ");
   double price = b.nextInt();
   System.out.print("\nCustomer Name: ");
   String name = a.nextLine();
   System.out.print("Quantity: ");
   int quantity = b.nextInt();
   System.out.print("\nPLAN\n[1] 12 months 3% interest\n[2] 5 months 5% interest\n[3] 3 months 10% interest");
   System.out.print("\nEnter your plan: ");
   int choice = b.nextInt();
   
   
   if (choice == 1) {
      double pq = price * quantity;
      double interest2 = pq * 0.03;
      double total = pq + interest2;
      double mons = total / 12;
         System.out.print("Total price with interest is " + total + ".\nMonthly payment will be " + mons);
   } else if (choice == 2) {
      double pq = price * quantity;
      double interest2 = pq * 0.05;
      double total = pq + interest2;
      double mons = total / 5;
         System.out.print("Total price with interest is " + total + ".\nMonthly payment will be " + mons);
   } else if (choice == 3) {
      double pq = price * quantity;
      double interest2 = pq * 0.1;
      double total = pq + interest2;
      double mons = total / 3;
         System.out.print("Total price with interest is " + total + ".\nMonthly payment will be " + mons);
   } else if (choice > 3) {
         System.out.print("No Plans Available!");
         }
   }
}