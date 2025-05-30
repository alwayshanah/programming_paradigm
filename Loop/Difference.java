import java.util.Scanner;

public class Difference {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   int num = scan.nextInt();
   
   int difference = 0;
   for (int i = 1; i <= num; i++) {
       difference -= i;
   }
      System.out.print(difference);
   }
}
   