import java.util.Scanner;

public class VowCon {
    public static void main (String [] args) {
    
    Scanner scan = new Scanner (System.in);
    
    System.out.print("Enter a letter: ");
    char letter = scan.next().charAt(0);
    
    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
      System.out.print("It's a Vowel.");
    } else {
      System.out.print("It's a Consonant.");
      }
    }
}