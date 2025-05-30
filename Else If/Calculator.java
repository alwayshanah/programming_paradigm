import java.util.Scanner;

public class Calculator {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   float number = scan.nextInt();
   System.out.print("Enter another number: ");
   int times = scan.nextInt();
   System.out.print("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division");
   System.out.print("\nEnter an operator: ");
   int operator = scan.nextInt();
   
   for (int i=1; i <= times; i++)
   if (operator == 1) {
      System.out.println(number + " + " + i + " = " + (i + number)); }
   else if (operator == 2) {
      System.out.println(number + " - " + i + " = " + (number - i)); }
   else if (operator == 3) {
      System.out.println(number + " - " + i + " = " + (i * number)); }
   else if (operator == 4) {
      System.out.println(number + " / " + i + " = " + (number / i)); }
   if (operator >= 5) {
      System.out.print("Your Input is Invalid!"); }
      }
   }
