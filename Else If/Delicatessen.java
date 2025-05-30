import java.util.Scanner;

public class Delicatessen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String item, overnight;
        double price;

        System.out.println("Enter your item:");
        item = input.nextLine();

        System.out.println("Enter the price of your item:");
        price = input.nextDouble();
                input.nextLine();

        System.out.println("Do you want overnight delivery? (Y/N): ");
        overnight = input.nextLine();

        if (overnight.equals("Y")) {
            if (price < 10) {
                price = price + 2 + 5;
                System.out.println("Your total for overnight delivery is: " + price);
            } else {
                price = price + 3 + 5;
                System.out.println("Your total for overnight delivery is: " + price);
            }
        } else {
            if (price < 10) {
                price = price + 2;
                System.out.println("Your total for regular delivery is: " + price);
            } else {
                price = price + 3;
                System.out.println("Your total for regular delivery is: " + price);
            }
        }

        input.close(); 
    }
}
