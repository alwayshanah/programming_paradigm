import java.util.Scanner;

public class SumOfAllOddNumbers {
   public static void main (String [] args) {
   
   Scanner sc = new Scanner (System.in);
    
   System.out.print("Enter the number of limits: ");
   int num = sc.nextInt();
   
   int sum = 0;
   for (int i = 1; i <= num; i++) {
      if (i % 1 == 0 && i % 2 != 0) 
      sum += i;
   }
      System.out.println(sum);
      }
   }