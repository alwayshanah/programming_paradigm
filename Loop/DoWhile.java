import java.util.Scanner;

public class DoWhile {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   Scanner scanb = new Scanner (System.in);
   
   System.out.print("[1] Hanah\n[2] Hannah");
   System.out.print("\nEnter an option: ");
   int option = scan.nextInt();
   char select;
   
   do {
      if (option == 1) {
         System.out.print("You chose Hanah");
      } else if (option == 2) {
         System.out.print("You chose Hannah");
      } else {
         System.out.print("Invalid Input!");
      }
      System.out.print("\nDo you want to continue? [y/n]:");
      select = scanb.next().charAt(0);
   } while (select == 'y' || select == 'Y'); 
      }
   
}