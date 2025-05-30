import java.util.Scanner;

public class GradeAve {
   public static void main (String [] args){
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter IC111 grade: ");
   int ic1 = scan.nextInt();
   System.out.print("Enter IC112 grade: ");
   int ic2 = scan.nextInt();
   System.out.print("Enter EGE1 grade: ");
   int ege = scan.nextInt();
   
   double average = (ic1 + ic2 + ege) / 3;
   
   System.out.print("\nAverage is: " + average);
   
   if (average >= 74) {
      System.out.print("\nSorry, you failed!");
      }
   else if (average <= 75) {
      System.out.print("\nGreat, you passed!");
      }
   }
}