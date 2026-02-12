

public class Bankaccount {
    private float accountnumber;
    private double balance;
    public void deposit (double amount ){
        if (amount >0){
  balance +=amount;
  System.out.println("deposited:"+amount);
        }
        else {
            System.out.println("invalid amount to deposit ");
        }
    }
  public void withdraw(double amount )
{
    if (balance >= amount && amount >0)
    {
        balance -= amount ;
        System.out.println("withdrew:"+amount);
    }
    else {
        System.out.println("insufficient balance towithdraw ");
    }
}
    public float getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(float accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
