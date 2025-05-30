import java.util.Scanner ;

public class ItemToFind2 {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   int[] my_array1 = new int[5];
   
   System.out.println("Input 5 numbers: ");
   
   int sum = 0;
   for (int i = 0; i < my_array1.length; i++) {
      my_array1[i] = scan.nextInt();
      sum += my_array1[i];
   }
   
   System.out.print("What are the 2 numbers you are looking for?\nNum 1: ");
   int num1 = scan.nextInt();
   System.out.print("Num 2: ");
   int num2 = scan.nextInt();
   
  int i;
  for (i = 0; i < my_array1.length; i++) {
    if (num1 == my_array1[i]) {
        System.out.print("Found " + num1 + ", ");
        break;
      }
   }
    if (i == my_array1.length) {  
         System.out.print(num1 + " not found, ");
   }
  for (i = 0; i < my_array1.length; i++) {
    if (num2 == my_array1[i]) {
        System.out.print(num2);
        break;
      }
   }
    if (i == my_array1.length) {  
         System.out.print(num2 + " not found");
       }
    }
 }



  