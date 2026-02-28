package exceptionhandling;

public class bankaccount {
    public  double balance  ;
    public bankaccount(double amount ){
        this.balance  = amount;
    }
   public void withdraw (double amount) throws Exception {
        if(amount > balance ){
            throw new insufficientfundsexception(44);
        }
        balance -=amount ;
   }
}
