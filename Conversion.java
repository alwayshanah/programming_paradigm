import java.util.Scanner;  // binary, hexa, octal converter

public class Conversion {
    
    public static void getBinary(int num) {
      int quotient = num;
      String binaryNumber = "";
      
      while (quotient != 0) {
            int remainder = quotient % 2;
            quotient = quotient / 2;
            binaryNumber = remainder + binaryNumber;
        }
        System.out.println("\nBinary: " + binaryNumber);
    }
    public static void getHexadecimal(int num) {
        StringBuilder hexBuilder = new StringBuilder();
        while (num != 0) {
            int remainder = num % 16;
            if (remainder < 10) {
                hexBuilder.append((char) ('0' + remainder));
            } else {
                hexBuilder.append((char) ('A' + remainder - 10));
            }
            num /= 16;
        }
        String hex = hexBuilder.reverse().toString();
        System.out.println("\nHexadecimal: " + hex);
    }
    public static void getOctal(int num) {
       String octal = "";
       while (num > 0) {
            int remainder = num % 8;
            octal = remainder + octal;
            num /= 8;
        }
        if (octal.isEmpty()) {
            octal = "0";
        }
        System.out.println("\nOctal: " + octal);
    }
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String userInput; {
        
        System.out.println("Convert to: \n1 for Binary\n2 for Hexadecimal\n3 for Octal");
        System.out.print("\nChoice: ");
         int choice = input.nextInt();
        System.out.print("\nEnter number: ");
         int number = input.nextInt();
        
        switch(choice) {
            case 1:
            getBinary(number);
            break;
            case 2:
            getHexadecimal(number);
            break;
            case 3:
            getOctal(number);
            break;
            default:
            System.out.println("\nInvalid choice!"); }
    		}
	}
}