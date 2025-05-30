import java.util.Scanner;

public class RamyansKambingan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Ramyan's Kambingan and Bulaloan!");

        // Variables to store the total cost for each category
        int totalRice = 0;
        int totalViand = 0;
        int totalDrink = 0;
        int totalDessert = 0;

        // Rice
        do {
            System.out.print("\n\n[1] P10 Plain Rice\n[2] P15 Fried Rice\nChoose a Rice: ");
            int rice = scanner.nextInt();

            if (rice == 1) {
                int pr = 10;
                System.out.print("How many? ");
                int hwpr = scanner.nextInt();
                totalRice += pr * hwpr;
            } else if (rice == 2) {
                int fr = 15;
                System.out.print("How many? ");
                int hwfr = scanner.nextInt();
                totalRice += fr * hwfr;
            } else {
                System.out.print("Invalid Input!\nPress Enter to Input Again");
                scanner.nextLine();
                continue;
            }
            break;
        } while (scanner.nextLine().isEmpty());

        // Viand
        do {
            System.out.print("\n\n[1] P100 Bulalo\n[2] P95 Sinampalokan\n[3] P89 Caldereta\nChoose a Viand: ");
            int viand = scanner.nextInt();

            if (viand == 1) {
                int bl = 100;
                System.out.print("How many? ");
                int hwbl = scanner.nextInt();
                totalViand += bl * hwbl;
            } else if (viand == 2) {
                int sl = 95;
                System.out.print("How many? ");
                int hwsl = scanner.nextInt();
                totalViand += sl * hwsl;
            } else if (viand == 3) {
                int cal = 89;
                System.out.print("How many? ");
                int hwcal = scanner.nextInt();
                totalViand += cal * hwcal;
            } else {
                System.out.print("Invalid Input!\nPress Enter to Input Again");
                scanner.nextLine();
                continue;
            }
            break;
        } while (scanner.nextLine().isEmpty());

        // Drink
        do {
            System.out.print("\n\n[1] P15 Buko Juice\n[2] P12 Pepsi\n[3] P12 Mountain Dew\nChoose a Drink: ");
            int bev = scanner.nextInt();

            if (bev == 1) {
                int bj = 15;
                System.out.print("How many? ");
                int hwbj = scanner.nextInt();
                totalDrink += bj * hwbj;
            } else if (bev == 2) {
                int pep = 12;
                System.out.print("How many? ");
                int hwpep = scanner.nextInt();
                totalDrink += pep * hwpep;
            } else if (bev == 3) {
                int md = 12;
                System.out.print("How many? ");
                int hwmd = scanner.nextInt();
                totalDrink += md * hwmd;
            } else {
                System.out.print("Invalid Input!\nPress Enter to Input Again");
                scanner.nextLine();
                continue;
            }
            break;
        } while (scanner.nextLine().isEmpty());

        // Dessert
        do {
            System.out.print("\n\n[1] P69 Halo Halo\n[2] P80 Leche Flan\n[3] P50 Mango Float\nChoose a Dessert: ");
            int des = scanner.nextInt();

            if (des == 1) {
                int hl = 69;
                System.out.print("How many? ");
                int hwhl = scanner.nextInt();
                totalDessert += hl * hwhl;
            } else if (des == 2) {
                int lf = 80;
                System.out.print("How many? ");
                int hwlf = scanner.nextInt();
                totalDessert += lf * hwlf;
            } else if (des == 3) {
                int mf = 50;
                System.out.print("How many? ");
                int hwmf = scanner.nextInt();
                totalDessert += mf * hwmf;
            } else {
                System.out.print("Invalid Input!\nPress Enter to Input Again");
                scanner.nextLine();
                continue;
            }
            break;
        } while (scanner.nextLine().isEmpty());

        // Display order summary
        System.out.println("\nOrder Summary:");
        displayOrder("Rice", totalRice);
        displayOrder("Viand", totalViand);
        displayOrder("Drink", totalDrink);
        displayOrder("Dessert", totalDessert);

        // Calculate and display the total order
        int totalOrder = totalRice + totalViand + totalDrink + totalDessert;
        System.out.println("\nTotal Order: P" + totalOrder);

        // Close the scanner
        scanner.close();
    }

    private static void displayOrder(String category, int totalCost) {
        if (totalCost > 0) {
            System.out.println(category + ": P" + totalCost);
        }
    }
}
   


