import java.util.Scanner; // machine problem 1 

public class PointOFSale {
   public static void main (String [] args){
   
   Scanner abc = new Scanner (System.in);
   Scanner qwe = new Scanner (System.in);
   
   System.out.print("Product ID: ");
      String productId = qwe.nextLine();
   System.out.print("Description: ");
      String description = qwe.nextLine();                      
   System.out.print("Price: ");
      double price = abc.nextDouble();
   System.out.print("Quantity: ");
      int quantity = abc.nextInt();    
   System.out.print("\nCustomer Name: ");
      String name = qwe.nextLine();             
   System.out.print("Months to pay: ");
      int monsToPay = abc.nextInt();
   System.out.print("%Interest (in %): ");
      double interest = abc.nextDouble();
   
   double pq = price * quantity;
   double inter = interest / 100;
   double interest2 = pq * inter;
   double total = pq + interest2; 
   double mons = total / monsToPay; 
   
   System.out.print("\nSUMMARY\n"+ productId + " " + description + "\nREGULAR PRICE IS " + pq + "\n" + name + ", +" + interest + "% interest");
   System.out.print("\nTOTAL PRICE WITH INTEREST IS " + total + "\nPayment per month (" + monsToPay + " months) is " + mons);
   
   }
}