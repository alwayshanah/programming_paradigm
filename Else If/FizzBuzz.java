import java.util.Scanner;

public class FizzBuzz {
   public static void main(String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   int number = scan.nextInt();
   
   if (number % 3 == 0 && number % 5 == 0) {
      System.out.print("FizzBuzz");
   } else if (number % 3 == 0) {
      System.out.print("Fizz");
   } else if (number % 5 == 0) {
      System.out.print("Buzz");
   } else {
      System.out.print("not divisible");
      }
   }
}