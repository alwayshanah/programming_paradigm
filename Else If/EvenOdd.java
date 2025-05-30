import java.util.Scanner;

public class EvenOdd {
   public static void main(String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   int number = scan.nextInt();
   
   if (number % 2 == 0) {
      System.out.print(number + " is Even");
   } else {
      System.out.print(number + " is Odd");
      }
   }
}