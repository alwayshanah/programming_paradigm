import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("How many row? ");
        int r = scanner.nextInt();
        System.out.print("How many column? ");
        int c = scanner.nextInt();
        
        for (int row = 1; row <= r; row += 1) {
        for (int col = 1; col <= c; col += 1) {
             int multiplier = (col - 1) * c + row;
                System.out.print(number + " x " + multiplier + " = " + (multiplier * number) + "\t\t"); }
                System.out.println(); 
        }
    }
}
