import java.util.Scanner;

public class Installment {
   public static void main (String [] args) {
   
   Scanner sir = new Scanner (System.in);
      
   System.out.print("Enter Product Code: ");
      String productCode = sir.nextLine();
   System.out.print("Enter Description: ");
      String description = sir.nextLine();
   System.out.print("\nEnter Customer Name: ");
      String name = sir.nextLine();
      
   System.out.print("Price: ");
      double price = sir.nextDouble();
   System.out.print("Quantity: ");
      int quantity = sir.nextInt();
   System.out.print("Months to Pay: ");
      int monsToPay = sir.nextInt();
   System.out.print("%Interest: "); // ngano naay modulo? pwede raman gud wla
      double interest = sir.nextDouble();
      
   double total = price * quantity;
   double interest2 = total * (interest / 100);
   double monthly = (total + interest2) / (monsToPay);
   
   System.out.print("\n" + productCode + " " + description + "\nOrdered by " + name + "\nProduct price is " + price);
   System.out.printf("\n%.2f for %d months.%n", monthly, monsToPay); 
   // %.2f is used to format a floating-point number (para ma 2 decimals lng sya or u can change the number to any number depende kung pila ka decimals imo bet) 
   // %d is a format specifier (simply, e display lng niya ang integer value - same sa C language)
   // %n is another character for newline - same sa C language
   
   }
}