import java.util.Scanner;

public class Vcipher {
   public static void main(String [] args) {
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Encrypted: ");
      String encrypted = scan.next();
      System.out.print("Key: ");
      String keyWord = scan.next();
      int length = keyWord.length();
      length = length%2;
      
      System.out.print("\nDeciphered: ");
      
      if (length == 1) {
         Sequence1(encrypted);
      } else if (length == 0) {
         Sequence2(encrypted);
      }
    }
   
   private static void Sequence1 (String encrypted) {
      char[] letter = new char [encrypted.length()];
      char[] reverse = new char [encrypted.length()];
      
      for(int i = 0; i < letter.length; i++) {
         letter[i] = encrypted.charAt(i);
      }
      
      int max = letter.length-1;
      for (int i = 0; i < reverse.length; i++) {
         reverse[i] = letter[max];
         if (reverse[i] == 'a'|| reverse[i] == 'E'|| reverse[i] == 'e'|| reverse[i] == 'E'|| reverse[i] == 'i'|| reverse[i] == 'I') {
            reverse[i] = ' ';
         }
         max--;
      }
      letter = reverse;
      
      for (int i = 0; i < letter.length; i++) {
         if (letter[i] != ' ') {
            System.out.print(letter[i]);
         }
      }
   }
   
   private static void Sequence2 (String encrypted) {
      char[] letter = new char[encrypted.length()];
      
      for(int i = 0; i < letter.length; i++) {
         letter[i] = encrypted.charAt(i);
         
         if (letter[i] == 'o'|| letter[i] == 'O'|| letter[i] == 'u'|| letter[i] == 'U') {
            letter[i] = ' ';
         } else if (letter[i] == 'v') {
            letter[i] = 'r';
         } else if (letter[i] == 'V') {
            letter[i] = 'R';
         } else if (letter[i] == 'r') {
            letter[i] = 'v';
         } else if (letter[i] == 'R') {
            letter[i] = 'V';
         }
      }
      
      for (int i = 0; i < letter.length; i++) {
         if (letter[i] != ' ') {
            System.out.print(letter[i]);
         }
      }
   }  
}