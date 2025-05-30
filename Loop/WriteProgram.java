import java.util.Scanner;

public class WriteProgram {
   public static void main (String [] args) {
   
   Scanner iz = new Scanner (System.in);
   Scanner in = new Scanner (System.in);
   
   char choice;
   do { 
   System.out.print("\nEnter your desired grading system (in percentage) with a total of 100%");
   System.out.print("\n\nQuiz - ");
   double quiz = iz.nextDouble();
   System.out.print("Assignment - ");
   double assignment = iz.nextDouble();
   System.out.print("Exam - ");
   double exam = iz.nextDouble();
   System.out.print("Oral Recitation - ");
   double oralRecit = iz.nextDouble();
   System.out.print("\nHow many quiz? ");
   double quiz1 = iz.nextDouble();
   System.out.print("How many assignment? ");
   double assignment1 = iz.nextDouble();   
   System.out.print("\n");
   
   double sumq = 0;
   for (int i = 1; i <= quiz1; i++) {
      System.out.print("Enter quiz " + i + " score: ");
      double qz = iz.nextDouble(); 
      sumq += qz; }
      
   double suma = 0;
   for (int i = 1; i <= assignment1; i++) {
      System.out.print("Enter assignment " + i + " score: ");
      double as = iz.nextDouble(); 
      suma += as; }
     
   System.out.print("\nEnter exam score: ");
   double examsc = iz.nextDouble();
   System.out.print("Enter oral recitation score: ");
   double orre = iz.nextDouble();
   
   double qave = sumq / quiz1;
   double qper = qave * (quiz / 100);
   
   System.out.print("\nQuiz Average: " + qave);
   System.out.print("\n" + quiz + " percent of " + qave + " is " + qper);
   
   double aave = suma / assignment1;
   double aper = aave * (assignment / 100);
   
   System.out.print("\n\nAssignment Average: " + qave);
   System.out.print("\n" + assignment + " percent of " + aave + " is " + aper);
   
   double exper = examsc * (exam / 100);
   
   System.out.print("\n\n" + exam + " percent of " + examsc + " is " + exper);
   
   double oper = orre * (oralRecit / 100);
   
   System.out.print("\n" + oralRecit + " percent of " + orre + " is " + oper);
   
   double totalgrade = qper + aper + exper + oper;
   
   System.out.print("\n\nTOTAL GRADE is " + totalgrade);
   
   if (totalgrade <= 74) {
      System.out.print("\nRating: 5.0 ");
   } else if (totalgrade >= 75 && totalgrade <= 76) {
      System.out.print("\nRating: 3.0");
   } else if (totalgrade >= 77 && totalgrade <= 79) {
      System.out.print("\nRating: 2.75"); 
   } else if (totalgrade >= 80 && totalgrade <= 82) {
      System.out.print("\nRating: 2.5"); 
   } else if (totalgrade >= 83 && totalgrade <= 85) {
      System.out.print("\nRating: 2.25"); 
   } else if (totalgrade >= 86 && totalgrade <= 88) {
      System.out.print("\nRating: 2.0"); 
   } else if (totalgrade >= 89 && totalgrade <= 91) {
      System.out.print("\nRating: 1.75"); 
   } else if (totalgrade >= 92 && totalgrade <= 94) {
      System.out.print("\nRating: 1.5"); 
   } else if (totalgrade >= 95 && totalgrade <= 97) {
      System.out.print("\nRating: 1.25"); 
   } else if (totalgrade >= 98 && totalgrade <= 100) {
      System.out.print("\nRating: 1.0"); 
   }
   System.out.print("\n\nAgain? [y/n]: ");
   choice = in.next().charAt(0);
   } while (choice == 'y' || choice == 'Y');
   }
}
   
