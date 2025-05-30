import java.util.Scanner;

public class Precursor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers in the search list: ");
        int[] searchList = new int[100];  // assumption length 
        int searchListSize = 0; 
        int number;

        while (true) { // infinite loop = continue accepting numbers until the condition is met
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            searchList[searchListSize] = number;
            searchListSize++; 
        }

        System.out.println("Enter numbers to be excluded from the search list:");
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

        scanner.close(); // inputs are being forgotten except the numbers inputted as array

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

        System.out.println("Found " + foundCount + " numbers:");
        for (int i = 0; i < foundCount; i++) {
            System.out.print(foundNumbers[i] + " ");
        }
    }
}
