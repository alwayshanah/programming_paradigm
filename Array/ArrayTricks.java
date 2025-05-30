// Theo Benedict S. Pasia
// Array Tips and Tricks

import java.util.Scanner;

public class ArrayTricks {
   public static void main(String [] args) {
      Scanner scan = new Scanner(System.in);
      int val, counter;
      
      String[] lessons = {"[1] Filling and Printing Arrays", "[2] Sorting Arrays", "[3] Finding the Maximum and Minimum Value in an Array",
      "[4] Item Finding in an Array", "[5] Eliminating Duplicates in an Array"};
      for(int i=0; i<lessons.length; i++) {
         System.out.println(lessons[i]);
      }
      System.out.print("\nWhat lesson do you want to learn? ");
      int choice = scan.nextInt();
      System.out.println("");
      
      switch (choice) {
         case 1:
            // Filling and printing an array using for loops
            System.out.print("Enter length of array: ");
            counter = scan.nextInt();
            int[] arr1 = new int[counter];
            // Fills the array
            for(int i=0; i<arr1.length; i++) {
               System.out.print((i+1)+". ");
               val = scan.nextInt();
               arr1[i] = val;
            }
            // Prints the array
            for(int i=0; i<arr1.length; i++) {
               System.out.print(arr1[i]+" ");
            }
            break;
            
         case 2:
            int temp = 0;
            // Sorting Arrays
            System.out.print("Enter length of array: ");
            counter = scan.nextInt();
            int[] arr2 = new int[counter];
            // Filling the Array
            for(int i=0; i<arr2.length; i++) {
               System.out.print((i+1)+". ");
               val = scan.nextInt();
               arr2[i] = val;
            }
            // Sorting the Array
            for(int i=1; i<arr2.length; i++) {
               for(int j=i; j>0; j--) { 
                  if(arr2[j] > arr2[j-1]) { // in descending order, change to < for ascending order
                     temp = arr2[j];
                     arr2[j] = arr2[j-1];
                     arr2[j-1] = temp;
                  }
               }
            }
            // Printing the Array
            for(int i=0; i<arr2.length; i++) {
               System.out.print(arr2[i]+" ");
            }
            break;
            
         case 3:
            // Finding the Maximum and Minimum Value of an Array
            System.out.print("Enter length of array: ");
            counter = scan.nextInt();
            int[] arr3 = new int[counter];
            // Filling the Array
            for(int i=0; i<arr3.length; i++) {
               System.out.print((i+1)+". ");
               val = scan.nextInt();
               arr3[i] = val;
            }
            // Sorting the Array
            for(int i=1; i<arr3.length; i++) {
               for(int j=i; j>0; j--) { 
                  if(arr3[j] < arr3[j-1]) {
                     temp = arr3[j];
                     arr3[j] = arr3[j-1];
                     arr3[j-1] = temp;
                  }
               }
            }
            System.out.print("Minimum value is "+arr3[0]+". Maximum value is "+arr3[arr3.length-1]+".");
            break;
            
         case 4:
            // Item Finding in an Array
            System.out.print("Enter length of array: ");
            counter = scan.nextInt();
            int[] arr4 = new int[counter];
            // Filling the array  
            for(int i=0; i<arr4.length; i++) {
               System.out.print((i+1)+". ");
               val = scan.nextInt(); 
               arr4[i] = val;
            }   
            System.out.print("Enter value to find: ");
            int num = scan.nextInt();
            
            System.out.print("Found the number: ");
            for(int i=0; i<arr4.length; i++) {
               if(arr4[i]==num) {
                  System.out.print(arr4[i]+" ");   
               }
            }       
            break;
            
         case 5:
            int temp2 = 0;
            // Eliminating Duplicates in an Array 
            System.out.print("Enter length of array: ");
            counter = scan.nextInt();
            int[] arr5 = new int[counter];
            // Filling the array
            for(int i=0; i<arr5.length; i++) {
               System.out.print((i+1)+". ");
               val = scan.nextInt();
               arr5[i] = val;
            }
            // Sorting the array
            for(int i=1; i<arr5.length; i++) {
               for(int j=i; j>0; j--) {
                  if(arr5[j] < arr5[j-1]) {
                     temp2 = arr5[j-1];
                     arr5[j-1] = arr5[j];
                     arr5[j] = temp2;  
                  }
               }
            }
            // Eliminating Duplicates
            for(int i=1; i<arr5.length; i++) {
               if(arr5[i-1]==arr5[i]) {
                  arr5[i-1]=0;
               }
            }
            System.out.print("Final values are: ");
            for(int i=0; i<arr5.length; i++) {
               if(arr5[i]!=0) {
                  System.out.print(arr5[i]+" ");
               }
            }
            break;                   
      }
   }
}