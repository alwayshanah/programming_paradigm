import java.util.Scanner;

public class GreatestValueOf3 {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter the first number: ");
   int num1 = scan.nextInt();
   System.out.print("Enter the second number: ");
   int num2 = scan.nextInt();
   System.out.print("Enter the third number: ");
   int num3 = scan.nextInt();
   
   if (num1 > num2) {
      int largest = num1;
         System.out.print("The largest number is " + largest);
   } else if (num2 > num3) {
      int largest2 = num2;
         System.out.print("The largest number is " + largest2);
   } else if (num3 > num1){
         System.out.print("The largest number is " + num3);
     }
   }
}