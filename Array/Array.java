import java.util.Scanner;

public class Array {
   public static void main (String [] args){
   
   Scanner scan = new Scanner (System.in);
   
   int[] numbers = new int[10];
   
   System.out.println("Input 10 numbers: ");
   
   int sum = 0;
   for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scan.nextInt();
      sum += numbers[i];
   }
   
   System.out.print("Numbers inputted are: ");
   
   for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
   }
   
   System.out.print("\nSum of numbers: " + sum);
   
   }
}