public class PartTimeEmplyee extends Employee {
   private double hourlyPay;
   
   public PartTimeEmplyee (String numberIn, String nameIn, double hourlyPayIn) {
   super (numberIn, nameIn);
   hourlyPay = hourlyPayIn;
}
   public void setHourlyPay (double hourlyPayIn) {
   hourlyPay = hourlyPayIn;
}
   public double getHourlyPay() {
   return hourlyPay;
}
   public  double calculateWeeklyPay (int noOfHoursIn) {
   return noOfHoursIn * hourlyPay;
   }
}