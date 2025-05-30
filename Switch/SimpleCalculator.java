import java.util.Scanner; // simple caculator using char

class SimpleCalculator {
  public static void main(String[] args) {

    char operator;
    Double num1, num2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: + - * /");
    operator = input.next().charAt(0);

    System.out.print("Enter first number: ");
    num1 = input.nextDouble();

    System.out.print("Enter second number: ");
    num2 = input.nextDouble();

    switch (operator) {
      case '+':
        result = num1 + num2;
        System.out.println("\n" + num1 + " + " + num2 + " = " + result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println("\n" + num1 + " - " + num2 + " = " + result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println("\n" + num1 + " * " + num2 + " = " + result);
        break;
      case '/':
        result = num1 / num2;
        System.out.println("\n" +num1 + " / " + num2 + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}