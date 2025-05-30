import java.util.Scanner;

public class Array1 {
   public static void main (String [] args) {
   
   int [] array = {-10, 1, 0, -30, 100, 3, 4, 4, 5};
   int temp;
   
   for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0; j--){
         if (array[j] < array [j - 1]) {
            temp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = temp;
         }
      }
   }
   
   for (int i = 0; i < array.length; i++) 
      System.out.println(array[i]);
      
   System.out.print("Max " + array[8]);
   System.out.print("\nMin " + array[0]);
   
   }
}