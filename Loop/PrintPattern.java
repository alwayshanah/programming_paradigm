import java.util.Scanner;

public class PrintPattern {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a letter: ");
   String letter = scan.nextLine();
   System.out.print("How many times? ");
   int times = scan.nextInt();
   
   for (int i = 1; i <= times; i++) {
   for (int j = 1; j <= i; j++) {
      System.out.print(letter); 
   }
      System.out.println(); 
      }
   }
}

