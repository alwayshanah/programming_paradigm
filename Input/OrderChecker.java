import java.util.Scanner;

public class OrderChecker {
     public static void main (final String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Bolts: ");
        int bolts  = input.nextInt();

        System.out.println("Enter the number of Nuts: ");
        int nuts  = input.nextInt();

        System.out.println("Enter the number of Washers: ");
        int washers  = input.nextInt();

        System.out.println("\nBolts: "+ bolts);
        System.out.println("Nuts: "+ nuts);
        System.out.println("Washers: "+ washers);
        System.out.println("Total =: "+ total (bolts, nuts, washers));
    }

    public static int total (int bolts, int nuts, int washers) {
        return (bolts*10) + (nuts*8) + (washers*5); }
}
