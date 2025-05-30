import java.util.Scanner; // larger value identifier

public class GreatestValue {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, largest;
        
        System.out.print("Enter the first number: ");
         num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
         num2 = scan.nextInt();
        
        
        if (num1 > num2) {
            largest = num1;
        }else if (num1 < num2) {
            largest = num2;     
            
          System.out.println("\nThe number that has the largest value is: " + largest); 
       
        }else if (num1 == num2) {     
            
          System.out.println("No largest number since they are equal.");
        }
    }
}