 import java.util.Scanner; // checked by sir
 
 public class Installment3 {
 public static void main (String [] args) {
 
   Scanner forAllNumbers = new Scanner (System.in);
   Scanner forAllStrings = new Scanner (System.in);
   
   System.out.print("Product Code: ");
   String productCode = forAllStrings.nextLine();
   System.out.print("Description: ");
   String description = forAllStrings.nextLine();
   System.out.print("\nName: ");
   String name = forAllStrings.nextLine();
   
   System.out.print("Price: ");
   int price = forAllNumbers.nextInt();
   System.out.print("Quantity: ");
   int quantity = forAllNumbers.nextInt();
   System.out.print("Months to Pay: ");
   int monthsToPay = forAllNumbers.nextInt();
   System.out.print("%Interest: ");
   double interest = forAllNumbers.nextDouble();
   
   double total = price * quantity;
   double interest2 = total * (interest / 100);
   double monthly = (total + interest2) / (monthsToPay);
   
   System.out.print("\n" + productCode + " " + description + "\nOrdered by " + name + "\nProduct price is " + price);
   System.out.printf("\n%.2f for %d months.%n", monthly, monthsToPay);
 
   }
 }