import java.util.Scanner; // simple discount (no other discount value)

public class DiscountedPrice {
	public static void main(String args[]){
   
      Scanner ehhe = new Scanner (System.in);
	   double  discountRate, discountedPrice, amountofPurchase, s;
               
   System.out.print("Amount of Purchase: ");
      amountofPurchase = ehhe.nextDouble();
   
      discountRate = 10; // 10 means 10% 		
	System.out.print("Discount Rate = " + discountRate + "\n");
         
         s = 100 - discountRate;
	   discountedPrice= (s * amountofPurchase) / 100;
   System.out.print("Discounted Price = " + discountedPrice);
 
	}
}