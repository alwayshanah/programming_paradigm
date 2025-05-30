import java.util.Scanner ;

public class ItemToFind {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in);
   
   int [] my_array1 = {1, 2, 3, -10, 5};
   
   int itemToFind1 = 1;
   int itemToFind2 = -10;
   
   for (int i = 0; i < my_array1.length; i++) {
      if (itemToFind1 == my_array1[i]) {
         System.out.print("Found the " + itemToFind1);
      } else if (itemToFind2 == my_array1[i]) {
         System.out.print("\nFound the " + itemToFind2);
      }          
      }
   }
}