import java.util.Scanner;

public class Categorizer {
   public static void main(String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter Age: ");
   int age = scan.nextInt();
   
   if (age >= 60) {
      System.out.print("Senior Citizen");
   } else if (age >= 19 && age <= 59) {
      System.out.print("Adult");
   } else if (age >= 13 && age <= 18) {
      System.out.print("Teenager");
   } else if (age <= 12) {
      System.out.print("Child");
      }
   }
}