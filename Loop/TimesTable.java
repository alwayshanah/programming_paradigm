import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("How many times? ");
        int times = scanner.nextInt();
        
        System.out.print("\n");
        
        for (int i = 1; i <= times; i++) {
            System.out.println(number + " x " + i + " = " + (number * i)); 
        }
    }
}
