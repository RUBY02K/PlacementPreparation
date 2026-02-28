package exceptionhandling;

public class insufficientfundsexception extends Exception{
    private double amount ;
    public insufficientfundsexception(double amount ){


        super("what do you want ?you dont have money ");
        this.amount = amount ;

}

    public double getAmount() {
        return amount;
    }
}
