import java.util.Scanner; // machine problem 2

public class SimpleCal {
   public static void main (String [] args) {
      
      Scanner emz = new Scanner (System.in);
      int num1, num2, sum, difference, product, quotient;
      
      System.out.print("Enter frist integer: ");
         num1 = emz.nextInt(); 
      System.out.print("Enter second integer: ");
         num2 = emz.nextInt();
      
      sum = (num1 + num2);
         System.out.println("Sum: " + sum);
         
      difference = (num1 - num2);
         System.out.println("Difference: " + difference);
      
      product = (num1 * num2);
         System.out.println("Product: " + product); 
      
      quotient = (num1 / num2);
         System.out.println("Quotient: " + quotient);
      
   }
}