import java.util.Scanner;

public class BmiCal {
   public static void main (String [] args) {
   
   Scanner kimmy = new Scanner (System.in);
   
   System.out.print("Do you know your height in meters? (yY/nN): ");
   String answer = kimmy.nextLine();
    
   double height;
   
  if (answer.equals("y") || answer.equals("Y")) {
      System.out.print("Enter your Height in m: ");
      height = kimmy.nextDouble();
  } else if (answer.equals("n") || answer.equals("N")) {
      System.out.print("Enter your height(cm)to be converted into meters: ");
      double cm = kimmy.nextDouble();
      height = cm / 100;
      System.out.print(cm + " cm = " + height + " m"); 
  } else {
      System.out.print("Invalid input!");
      return; 
  }

   System.out.print("Enter your Weight in kg: ");
   double weight = kimmy.nextDouble();
      
   double BMI = weight / (height * height);
   
   System.out.printf("BMI = %.2f",BMI);
   
  if (BMI < 18.5) {
      System.out.print("\nYou are underweight.");
  } else if (BMI >= 18.5 && BMI < 24.9) {
      System.out.print("\nYou are in the normal weight range.");
  } else if (BMI >= 24.9 && BMI < 30) {
      System.out.print("\nYou are overweight.");
  } else {
      System.out.print("\nYou are obese.");
         }
      }      
   }