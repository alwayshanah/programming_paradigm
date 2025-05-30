import java.util.Scanner;

public class BeverageMachine {
    public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of your choice here: ");
      int choice = scan.nextInt();
    
        switch(choice){
        case 1:
        System.out.println("You chose Cola.");
        break;
        case 2:
        System.out.println("You chose Sprite.");
        break;
        case 3:
        System.out.println("You chose Fanta.");
        break;
        case 4:
        System.out.println("You chose Water.");
        break;
        case 5:
        System.out.println("You chose Choco.");
        break;
        default:
        System.out.println("Choice is Invalid, Please Try Again.");
        }
    }
}