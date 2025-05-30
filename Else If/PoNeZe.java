import java.util.Scanner;

public class PoNeZe {
   public static void main (String [] args){
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   int number = scan.nextInt();
   
   if (number > 0) {
      System.out.print(number + " is Positive"); 
   } else if (number < 0) {
      System.out.print(number + " is Negative");
   } else if (number == 0) {
      System.out.print(number + " is Zero");
      }
   }
}