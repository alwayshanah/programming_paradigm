import java.util.Scanner;

class GradingProgram {
    public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      System.out.print("Your score here: ");
      int userScore = scan.nextInt();
      
        if (userScore >=90 && userScore <=100){
            System.out.println("Ka power ba. You got an A grade!");
        } else if (userScore >=80 && userScore <=89){
            System.out.println("Wow. You got a B grade!");
        } else if (userScore >= 70 && userScore <=79){
            System.out.println("Lumalaban yarn? You got a C grade!");
        } else if (userScore >=60 && userScore <=69){
            System.out.println("Napasobra ata chill mo pare. You got a D grade!");
        } else if (userScore >=0 && userScore <=59){
            System.out.println("Laban ta diha. You got an F grade!");
        }
    }
}