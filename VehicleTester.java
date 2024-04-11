import java.util.ArrayList;
import java.util.Scanner;

public class VehicleTester {

  private static Scanner scanner = new Scanner(System.in);
  private static ArrayList<Vehicle> vehicles = new ArrayList<>();

  public static void main(String[] args) {
    while (true) {
      printMenu();
      int choice = getUserChoice();
      switch (choice) {
        case 1:
          addVehicle();
          break;
        case 2:
          displayVehicles();
          break;
        case 3:
          deleteVehicle();
          break;
        case 4:
          sortVehicleByAge();
          break;
        case 5:
          System.out.println("Exiting program...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
    
  private static int getUserChoice() {
    int choice = scanner.nextInt();
    scanner.nextLine(); 
    return choice;
  }
  
  private static void printMenu() {
    System.out.println("\nMenu: \nVehicle Management System");
    System.out.println("1. Add Vehicle");
    System.out.println("2. Display Vehicles");
    System.out.println("3. Delete Vehicle");
    System.out.println("4. Sort Vehicles by Age");
    System.out.println("5. Quit");
    System.out.print("Enter your choice: ");
  }

  private static void addVehicle() {
    new VehicleOperations().addVehicle(vehicles);
  }

  private static void displayVehicles() {
    new VehicleOperations().displayVehicles(vehicles);
  }

  private static void deleteVehicle() {
    new VehicleOperations().deleteVehicle(vehicles);
  }

  private static void sortVehicleByAge() {
    new VehicleOperations().sortVehicleByAge(vehicles);
  }
}
