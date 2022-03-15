public class InsufficientFundsException extends Exception {
  private double amount;  
  public InsufficientFundsException(String msg)
   { 
     
     System.out.println(msg);
   }

  public double getAmount() {return this.amount;}; 
    
}
