import java.util.Scanner;

public class FloatNumbers {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter first number (with decimal): ");
   float num1 = scan.nextFloat();
   System.out.print("Enter second number (with decimal): ");
   float num2 = scan.nextFloat();
   
   if (num1 == num2) {
      System.out.print("They are the same.");
   } else {
      System.out.print("They are different.");
      }
   }
}