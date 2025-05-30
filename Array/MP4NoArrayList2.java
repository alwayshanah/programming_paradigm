import java.util.Scanner;

public class MP4NoArrayList2 {

   public static void main(String[] args) {
   Scanner key = new Scanner(System.in);
   int [] search = new int [100];
   int searchSize = 0;
   int num;

      System.out.println("Enter numbers in the search list: ");
         while (true) {
            num = key.nextInt();
            if (num == 0) {
               break;
            }
         search [searchSize] = num;   
         searchSize++;
         }
 
    int [] exclusion = new int [100];
    int exclusionSize = 0;
      
      System.out.println("Enter numbers to be excluded in the search list: ");
         while (true) {
            num = key.nextInt();
            if (num == 0) {
               break;
            }
         exclusion [exclusionSize] = num;   
         exclusionSize++;
         }
      
    int [] numFound = new int [searchSize]; 
    int found = 0;
      
      for (int i = 0; i < searchSize; i++) {
         boolean isExcluded = false;
            for (int j = 0; j < exclusionSize; j++) {
               if (search [i] == exclusion [j]) { 
                  isExcluded = true;
                  break;
          } 
           
      }
      
            if (!isExcluded) {
               numFound [found] = search [i];
               found++;
             }
         }       
         
     System.out.print("Found " + found + " numbers:\n");    
         for (int i = 0; i < found; i++) {
               System.out.print(numFound[i] + " ");         
         
         }
   
    }

}