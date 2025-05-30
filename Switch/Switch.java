import java.util.Scanner;

public class Switch {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   double quotient;
   
   System.out.print("Enter a number: ");
   float number = scan.nextInt();
   System.out.print("Enter another number: ");
   int times = scan.nextInt();
   System.out.print("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division");
   System.out.print("\nEnter an operator: ");
   int operation = scan.nextInt();
   
   switch (operation) {
   case 1:
   for (int i=1; i <= times; i++)
      System.out.println(number + " + " + i + " = " + (i + number));
   break;
   case 2:
   for (int i=1; i <= times; i++)
      System.out.println(number + " - " + i + " = " + (number - i)); 
   break;
   case 3:
   for (int i=1; i <= times; i++)
      System.out.println(number + " - " + i + " = " + (i * number)); 
   break;
   case 4:
   for (int i=1; i <= times; i++)
      System.out.println(number + " / " + i + " = " + (number / i)); 
   break;
   default:
      System.out.print("Your Input is Invalid!");
   break;
      }
   }
}