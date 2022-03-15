public class CheckAccount {

    private double balance;

    CheckAccount(){}

    public void deposit(double amount)throws InsufficientFundsException
    {
        this.balance += amount;

        if(amount <=0)
        {
            throw new InsufficientFundsException("Please enter a value more than 0");
        }
        System.out.println("You have depositied: "+ amount);
    }
    public void Withdraw(double amount) throws InsufficientFundsException
    {
        if(amount > this.balance)
        {
            double difference = amount - this.balance;
            throw new InsufficientFundsException("unable to withdraw, you are short of "+ amount);
        }
        else 
        {
            this.balance -= amount;
            System.out.println("The balance after withdraw is: "+ getBalance());
        }
    }

    public double getBalance()
    {
        System.out.println("current balance: " + this.balance);
        return this.balance;
    }

    public void setBalance(double amount)
    {
       this.balance = amount;
    }


    
}
