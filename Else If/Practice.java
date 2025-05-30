import java.util.Scanner;

public class Practice {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   double num = scan.nextDouble();
   System.out.print("How many times? ");
   int times = scan.nextInt();
   System.out.print("[1] Ascending\n[2] Descending");
   System.out.print("\nOrder: ");
   int order = scan.nextInt();
   System.out.print("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division");
   System.out.print("\nOperation: ");
   int choice = scan.nextInt();
   
     if (order == 1) {
   for (int i = 1; i <= times; i++) 
     if (choice == 1) {
      System.out.println(num + " + " + i + " = " + (num + i));
   } else if (choice == 2) {
      System.out.println(num + " - " + i + " = " + (num - i));
   } else if (choice == 3) {
      System.out.println(num + " * " + i + " = " + (num * i));
   } else if (choice == 4) {
      System.out.println(num + " / " + i + " = " + (num / i));
   } if (choice > 4) {
      System.out.print("invalid Choice!");
   }
   
   } else if (order == 2) {
   for (int i = times; i >= 1; i--) 
     if (choice == 1) {
      System.out.println(num + " + " + i + " = " + (num + i));
   } else if (choice == 2) {
      System.out.println(num + " - " + i + " = " + (num - i));
   } else if (choice == 3) {
      System.out.println(num + " * " + i + " = " + (num * i));
   } else if (choice == 4) {
      System.out.println(num + " / " + i + " = " + (num / i));
   } if (choice > 4) {
      System.out.print("invalid Choice!");
   }
   
      }
   }
}
 
  

