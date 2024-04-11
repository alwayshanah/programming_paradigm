import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class VehicleOperations {
    
  private static Scanner scanner = new Scanner(System.in);
   
  public void addVehicle(ArrayList<Vehicle> vehicles) {
    System.out.print("Enter registration number: ");
    String regNo = scanner.nextLine();
    System.out.print("Enter make: ");
    String make = scanner.nextLine();
    System.out.print("Enter year of manufacture: ");
    int yearOfManufacture;
    try {
      yearOfManufacture = scanner.nextInt();
      scanner.nextLine(); 
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a number for year.");
      return;
    }
    System.out.print("Enter value: ");
    double value;
    try {
      value = scanner.nextDouble();
      scanner.nextLine(); 
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a number for value.");
      return;
    }

    Vehicle vehicle = new Vehicle(regNo, make, yearOfManufacture, value);
    vehicles.add(vehicle);
    System.out.println("Vehicle added successfully!");
  }

  public void displayVehicles(ArrayList<Vehicle> vehicles) {
    if (vehicles.isEmpty()) {
      System.out.println("No vehicles found.");
      return;
    }
    System.out.println("List of vehicle details:");
    for (Vehicle vehicle : vehicles) {
      System.out.println(vehicle.toString());
    }
  }

  public void deleteVehicle(ArrayList<Vehicle> vehicles) {
    if (vehicles.isEmpty()) {
      System.out.println("No vehicles found.");
      return;
    }
    System.out.print("Enter the index of the vehicle to delete: ");
    int index;
    try {
      index = scanner.nextInt();
      scanner.nextLine(); 
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a number.");
      return;
    }
    
    index--;
    if (index < 0 || index >= vehicles.size()) {
      System.out.println("Invalid index. Please enter a valid index.");
      return;
    }

    vehicles.remove(index);
    System.out.println("Vehicle deleted successfully!");
  }

  public void sortVehicleByAge(ArrayList<Vehicle> vehicles) {
    printSortMenu();
    int choice = getUserChoice();
    switch (choice) {
      case 1:
        Collections.sort(vehicles, (v1, v2) -> v1.getYearOfManufacture() - v2.getYearOfManufacture());
        System.out.println("List of vehicle details sorted by age (ascending):");
        displayVehicles(vehicles);
        break;
      case 2:
        Collections.sort(vehicles, (v1, v2) -> v2.getYearOfManufacture() - v1.getYearOfManufacture());
        System.out.println("List of vehicle details sorted by age (descending):");
        displayVehicles(vehicles);
        break;
      case 3:
        System.out.println("Returning to main menu...");
        break;
      default:
        System.out.println("Invalid choice. Please try again.");
    }
  }
  
  private static int getUserChoice() {
    int choice = scanner.nextInt();
    scanner.nextLine(); 
    return choice;
  }
  
  private static void printSortMenu() {
    System.out.println("Sort Menu:");
    System.out.println("1. Sort by age (ascending)");
    System.out.println("2. Sort by age (descending)");
    System.out.println("3. Back to main menu");
    System.out.print("Enter your choice: ");
  }
}
