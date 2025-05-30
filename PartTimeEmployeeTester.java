import java.util.Scanner;
public class PartTimeEmployeeTester {
   public static void main(String[] args) {
   
   Scanner keyboard = new Scanner (System.in);
   Scanner keyboardString = new Scanner (System. in);
   String number, name;
   double pay; 
   int hours;
   PartTimeEmplyee emp;
   
   System.out.print ("Employee Number? ");
   number = keyboardString.nextLine();
   System.out.print ("Employee's Name? ");
   name = keyboardString.nextLine();
   System.out.print("Hourly Pay? ");
   pay = keyboard.nextDouble();
   System.out.print("Hours worked this week? ");
   hours = keyboard.nextInt();
   
   emp = new PartTimeEmplyee(number, name, pay);
   
   System.out.println();
   
      System.out.println(emp.getName());
      System.out.println(emp.getNumber());
      System.out.println(emp.calculateWeeklyPay(hours));
   }
}