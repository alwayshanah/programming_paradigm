import java.util.Scanner;

public class Precursor {
   public static void main (String [] args) {
   
   Scanner key = new Scanner (System.in);
   int index = 0, indexcount = 0, exlistcount = 0, count = 0;
   int[] array = new int [100000];
   
  System.out.println("Enter numbers in the search list: ");      
      for (int i = 1; i < 100000; i++) {;
       int list = key.nextInt();
         if (list == 0) {
            break; 
         } 
          array[index++] = list; 
          indexcount++; 
      }  
       
  System.out.println("Enter numbers to be excluded from the search list: ");
      for (int i = 1; i < 100000; i++) {
        int exlist = key.nextInt();
          if (exlist == 0) {
          break;        
          }
       
       for ( int j = 1; j < index; j++) {
              if (array[j-1] == exlist) {
                  array[j-1] = 0;
                  exlistcount++;
                  count = indexcount - exlistcount;
               }
            }
        }
 System.out.print("Found " + count + " numbers: ");
       for (int i = 1; i < index; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + ", ");        
          }
      }
   }
}

      
      

   
   
   
   
     