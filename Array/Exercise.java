import java.util.Scanner;

public class Exercise {
   public static void main (String [] args) {
   
   Scanner scanner = new Scanner (System.in);
   
   System.out.println("Enter numbers in the search list: ");
        int[] searchList = new int[100];  
        int searchListSize = 0; 
        int number, temp = 0;

        while (true) { 
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            searchList[searchListSize] = number;
            searchListSize++; 
        }
        
        for ( int i = 1; i < searchListSize; i++) {
               for ( int j = i; j > 1; j--) { 
                  if (searchList[j] < searchList[j-1]) { 
                     temp = searchList[j];
                     searchList[j] = searchList[j-1];
                     searchList[j-1] = temp;
                  }
               }
            }   
         
        System.out.println("\nEnter numbers to be excluded from the search list:");
        int[] exclusionList = new int[100]; 
        int exclusionListSize = 0;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            exclusionList[exclusionListSize] = number; 
            exclusionListSize++;
        }

        scanner.close(); 

        int[] foundNumbers = new int[searchListSize];
        int foundCount = 0;

        for (int i = 0; i < searchListSize; i++) {
            boolean isExcluded = false; 
            for (int j = 0; j < exclusionListSize; j++) {
                if (searchList[i] == exclusionList[j]) {  
                    isExcluded = true;
                    break;
                }
            }
            if (!isExcluded) { 
                foundNumbers[foundCount] = searchList[i];
                foundCount++;
            }
        }

        System.out.println("\nFound " + foundCount + " numbers:");
        for (int i = 0; i < foundCount; i++) {
            System.out.print(foundNumbers[i] + ", ");
        }

   
   }
}