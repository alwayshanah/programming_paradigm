import java.util.Scanner;

public class Overthink{
public static void main(String [] args) {

   Scanner lei = new Scanner(System.in);
   
   // to inuput a number
   System.out.println("\nEnter a numbers to the list: ");
   int [] userInput = new int[100];
   int index = 0;
   int user;
   
   // to put an end
   while (true){
   user = lei.nextInt();
   if (user == 0){
   break;
   }
   userInput[index] = user;
   index++;
   }
   
   // to input excluded numbers
   System.out.println("\nEnter a number to exclude: ");
   int [] exemptionList = new int[100];
   int exemption = 0;
   int exempt;
   
   // to put an end
   while (true){
   exempt = lei.nextInt();
   if (exempt == 0) {
   break;
   }
   exemptionList[exemption] = exempt;
   exemption++;
   }
   
   lei.close();
   
   // for found numbers
   int [] FoundNumbers = new int[index]; // you should put the scanner here the first one that is first declared as zero.
   int foundcount = 0;

   for (int i = 0; i < index; i ++) {
   boolean isExcluded = false; 
   
   for (int j  = 0; j < index; j++) {
   if (userInput[i] == exemptionList[j]){ 
   isExcluded = true; 
   break;
   }   
   }
   
   if(!isExcluded) {
   FoundNumbers[foundcount] = userInput[i];
   foundcount++;
   }
   }
   
   for(int i = 1; i < foundcount ; i++) {
   for(int j = i; j>0; j--){
   if(FoundNumbers[j] < FoundNumbers [j-1]) {
   int temp = FoundNumbers[j];
   FoundNumbers[j] = FoundNumbers[j-1];
   FoundNumbers[j-1] = temp;}
   }
   }

   System.out.println("\nFound " + foundcount + " numbers: ");
   for (int i = 0; i < foundcount; i++){
   System.out.print(FoundNumbers[i] + "  ");
   }

}
}
