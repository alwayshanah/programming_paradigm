import java.util.Scanner;

public class OddNumber {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter the number of limits: ");
   int num = scan.nextInt();
   
   for (int i = 1; i <= num; i++) {
      if (i % 1 == 0 && i % 2 != 0) {
         System.out.println(i);}
    }
  } 
}