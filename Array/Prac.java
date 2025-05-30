import java.util.Scanner;

public class Prac {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in); 
   
   System.out.print("Enter length: ");
   int lgth = scan.nextInt();
   
   int[] arrayy = new int[lgth];
   
   int i;
   for (i = 0; i < arrayy.length; i++) {
      System.out.print((i+1)+". ");
      int vals = scan.nextInt();
      arrayy[i] = vals;

   System.out.print("[1] Display in Ascending Order\n[2] Display in Descending Order\n[3] Count Positive & Negative Numbers");
   System.out.print("[4] Count Even & Odd Numbers\n[5] Display Repeating Numbers\n[6] Eliminate Repeating Numbers");
   System.out.print("[7] Number Look Up\n[8] Display Max & Min\n[9] Calculator");

   System.out.print("What would you like to do? ");
   int doo = nextInt();
   
   switch (doo) {
   case 1: // Display in Ascending Order
     for (i = 0; i < array.length; i++) {
         for (int j = i; j > 0; j--) { 
                  if (arrayy[j] > arrayy[j-1]) { 
                     temp = arrayy[j];
                     arrayy[j] = arrayy[j-1];
                     arrayy[j-1] = temp; }
               }
            }
      for (int i = 0; i < arrayy.length; i++) {
          System.out.print(arrayy[i] + " "); }
    break;
    case 2: // Display in Descending Order
      for (i = 0; i > array.length; i++) {
         for (int j = i; j > 0; j--) { 
                  if (arrayy[j] > arrayy[j-1]) { 
                     temp = arrayy[j];
                     arrayy[j] = arrayy[j-1];
                     arrayy[j-1] = temp; }
               }
            }
      for (int i = 0; i < arrayy.length; i++) {
          System.out.print(arrayy[i] + " "); }
    break;
    case 3: // Count Positive & Negative Numbers
      int positive = 0, negative = 0;
    for (int i = 0; i < arrayy.length; i++) {
      if (arrayy[i] > 0) {
         positive++;
    } else if (arrayy[i] < 0) {
         negative++; } 
     
     System.out.print("Positive: " + positive + "\nNegative: " + negative);
     break;
     case 4: // Count Even & Odd Numbers
       int odd = 0, even = 0;
    for (int i = 0; i < arrayy.length; i++) {
       if (myArray[i] %2 == 0) {
         even++;
     } else if (myArray[i] %2 != 0) {
         odd++; } 
     System.out.print("Even: " + even + "\nOdd: " + odd);
     break;
     case 5: // Display Repeating Numbers
     for (int i = 1; i < arrayy.length; i++) {
        if (arrayy[i-1] == arrayy[i]) {
                  arrayy[i-1] = 0; }
     }
      System.out.print("Final values are: ");
        for (int i = 0; i < arrayy.length; i++) {
           if (arrayy[i]!=0) {
                  System.out.print(arrayy[i]+" "); }
     }
     break;  
     case 6: // Eliminate Repeating Numbers
    for (int i = 1; i < arrayy.length; i++) {
        if (arrayy[i-1] == arrayy[i]) {
                  arrayy[i-1] = 0; }
     }
      System.out.print("Final values are: ");
        for (int i = 0; i < arrayy.length; i++) {
           if (arrayy[i]!=0) {
                  System.out.print(arrayy[i]+" "); }
     }
     break;
     case 7: // Number Look Up
    for (int i = 0; i < arrayy.length; i++) {
         if (array[i] == array[i]) {
          System.out.print("Found ")
         }
     }

     


     
 
     
     
     
    }
   }
  } 
}