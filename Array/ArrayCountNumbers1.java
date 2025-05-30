import java.util.Scanner;

public class ArrayCountNumbers1 {
   public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   
   int positive = 0, negative = 0, odd = 0,even = 0;  
   char n;
   int a, b;
   
   do{ 
   System.out.print("Enter the length of your input: ");
   int num = input.nextInt();
   int [] myArray = new int[num];
   
   if (num<=1){
   System.out.print("Please input a number greater than 1.");
   }
   
   else { 
   int sum = 0;
   System.out.println("\nEnter " + num + " numbers: ");
    for(int i = 0; i<myArray.length; i++) {
      myArray[i] = input.nextInt();
 
      if (myArray[i]>0) {
         positive++;
      }
      else if (myArray[i]<0) {
         negative++;
      }
      if (myArray[i]%2==0){
         even++;
      }
      else if (myArray[i]%2!=0){
         odd++;
      } 
     sum = sum + myArray[i]; }
      
      for( int i = 1; i<myArray.length; i++) { // para i-order siya
         for(int j=i; j>0; j--){ //j=1 ni diri
         if(myArray[j] < myArray [j-1]) //1 - 0
         {int temp = myArray[j]; // so 1
         myArray[j] = myArray[j-1]; // 0
         myArray[j-1] = temp;
         }}} 
        
 {
   System.out.print("\nEnter 2 Numbers that you need to find.");
   System.out.print("\nNumber 1: ");
   a = input.nextInt();
   System.out.print("Number 2: ");
   b = input.nextInt();
   
   int num2 = 0;
   int num3 = 0;
   
   for (int i=0; i<myArray.length; i++) {
      if (a == myArray[i]){
         num2++;
      }
      if (b == myArray[i]){
         num3++;
      }
       }    
       System.out.print("\n");
       System.out.print("\nNumbers inputted in ascending order: ");
       System.out.print("\n");
       for(int i=0; i< myArray.length; i++) {
      System.out.println(myArray[i]);  }
      
      System.out.print("\nResult: ");
      
      if (num2 == 0 && num3 == 0) {
         System.out.print("\n\nSystem Found " + a + " , " + b);
      }
      if (num2>0 && num3>0) {
         System.out.print("\n\nSystem Found " + a + " , " + b);
      }
      if (num2>0 && num3==0) {
         System.out.print("\n\nSystem Found " + a + ". Item " + b + " not found.");
      }
      if (num3>0 && num2==0) {
         System.out.print("\n\nSystem Found " + b + ". Item " + a + " not found.");
      }
      } 
             {
   System.out.print("\n\nPositive: " + positive + "\nNegative: " + negative + "\nEven: " + even + "\nOdd: " + odd);  
         }{
      
   System.out.print("\n\nSum: " + sum);

   System.out.print("\nMax: " + myArray[num-1]);
   System.out.print("\nMin: " + myArray[0]);
}   
      } 
      System.out.print("\n");
      System.out.println("\nDo you wanna continue? [Y/N]");
      n = input.next().charAt(0);
} while  (n == 'y' || n == 'Y');
}
}