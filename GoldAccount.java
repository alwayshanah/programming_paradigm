public class GoldAccount extends BankAccount {
    private double overdraftLimit;
    public GoldAccount(String numberIn, String nameIn, double limitIn) {
        super(numberIn, nameIn);
        overdraftLimit = limitIn;
    }
    public void setLimit(double limitIn) {
        overdraftLimit = limitIn;
    }
    public double getLimit() {
        return overdraftLimit;
    }
    
    @Override
    public boolean withdraw (double amountIn) {
        if (amountIn > balance + overdraftLimit) 
        {
            return false; 
        } else {
            balance = balance - amountIn; 
            return true; 
        }
    }
}