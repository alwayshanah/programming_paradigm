import java.util.Scanner;

public class Factor {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   int num = scan.nextInt();
   
   int factorial = 1;
   for (int i = 1; i <= num; i++) {
       factorial *= i; 
   }
      System.out.print(factorial); 
   }
}



       
