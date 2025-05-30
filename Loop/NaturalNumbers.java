import java.util.Scanner;

public class NaturalNumbers {
   public static void main (String [] args) {
   
   Scanner crush = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   int num = crush.nextInt();
  
   for (int i = num; i >= 1; i--) { //reverse
      System.out.println(i); }
               or 
   for (int i = 1; i <= num; i++) { //normal
      System.out.print(i); }
      
    }
 }
 
 
 
