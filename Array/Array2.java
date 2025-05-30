import java.util.Scanner;

public class Array2 {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   Scanner scanb = new Scanner (System.in);
   char select; 
   
   do {
   System.out.print("Enter a number: ");
   int num = scan.nextInt();
   
   if (num <= 1) {
      System.out.print("Please input a number greater than 1.");
   } else {
   int[] array = new int[num];
   
   int sum = 0;
   for (int i = 0; i < array.length; i++) {
      array[i] = scan.nextInt();
      sum += array[i];
   }
   
   System.out.println("Numbers inputted are: ");  
   for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0; j--){
         if (array[j] < array [j - 1]) {
            int temp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = temp;
         }
      }
   }
   
   for (int i = 0; i < array.length; i++) 
      System.out.println(array[i]);
      
      System.out.print("Max " + array[array.length-1]);
      System.out.print("\nMin " + array[0]);
   }
      System.out.print("\nDo you want to continue? [y/n]:");
      select = scanb.next().charAt(0);
   } while (select == 'y' || select == 'Y'); 

   }
}