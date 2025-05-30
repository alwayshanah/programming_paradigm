import java.util.Scanner;

public class GradeConversion {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Your grade here: ");
        int userGrade = scan.nextInt();
        
        if (userGrade <=74){
            System.out.println("Your grade is B - Beginning");
        } else if (userGrade <=79){
            System.out.println("Your grade is D - Developing");
        } else if (userGrade <=84){
            System.out.println("Your grade is AP - Approching Proficiency");
        } else if (userGrade <=89){
            System.out.println("Your grade is P - Proficient");
        } else if (userGrade >=90){
            System.out.println("Your grade is A - Advanced");
        }
    }
}

    
