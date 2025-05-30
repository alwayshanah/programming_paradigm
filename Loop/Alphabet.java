import java.util.Scanner;

public class Alphabet {
   public static void main (String [] args) {
   
   Scanner s = new Scanner (System.in);
   
   System.out.print("Enter a letter: ");
   char letter = s.next().charAt(0);
   
   for (char i = letter; i >= 'a'; i--) {
      System.out.println(i);
      }
   }
}