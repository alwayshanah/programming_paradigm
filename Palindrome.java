import java.util.Scanner; //scanner class para maka input ang user ug word

public class Palindrome {
	public void Constructor() {
	    String original, reverse = ""; 
            Scanner in = new Scanner(System.in);   
        System.out.println("Enter a word to check if it is a palindrome:");  
            original = in.nextLine();   
            
      int length = original.length();   //*para ma check whether ang word is pwede mabaliktad, we first reverse the word/string tapos e compare ang reversed word/string sa original
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("The word is a palindrome.");  
      else  
         System.out.println("The word is not a palindrome."); 
	}
         
	public static void main(String[] args) {
	    Palindrome chuchu = new Palindrome();
	    chuchu.Constructor();
	}
}
    

 

     