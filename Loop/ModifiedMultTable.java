import java.util.Scanner;

public class ModifiedMultTable {
   public static void main (String[] args) {
   
   Scanner pls = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   int number = pls.nextInt();
   System.out.print("How many times? ");
   int times = pls.nextInt();
   System.out.print("\n");
   
   for (int i = 1; i <= times; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
       }
   }
}