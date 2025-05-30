import java.util.Scanner;  // machine problem 1

public class Autobiography {
   public static void main (String [] args) {
   
      Scanner chuchu = new Scanner (System.in);
      String name, address, course, institution, subject, date, meridiem;
      int age, hour, minute;
   
      System.out.print("Name: ");
         name = chuchu.nextLine(); 
      System.out.print("Age: ");
         age = chuchu.nextInt();  
               chuchu.nextLine(); 
      System.out.print("Address: ");
         address = chuchu.nextLine();
      System.out.print("Course: ");
         course = chuchu.nextLine();
      System.out.print("Institution: ");
         institution = chuchu.nextLine();
      System.out.print("Subject you're looking forward everyday: ");
         subject = chuchu.nextLine();
      System.out.print("Day of the subject: ");
         date = chuchu.nextLine();
      System.out.print("Time of the subject in Hour: ");
         hour = chuchu.nextInt();  
      System.out.print("Time of the subject in Minute: ");
         minute = chuchu.nextInt();  
                  chuchu.nextLine();
      System.out.print("Meridiem: ");
         meridiem = chuchu.nextLine();
     
  System.out.println("\nHi! My name is " + name + ", I'm " + age + " years old and I live in " + address + ".");
  System.out.println("I'm currently enrolled in the " + course + " course at " + institution + ", and");
  System.out.println("I always look forward to my " + subject + " class,");
  System.out.println("which is scheduled every " + date + " at " + hour + ":" + minute + " " + meridiem + ".");
  
  }
}