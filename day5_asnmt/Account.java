package day5_asnmt;

public class Account {
    public double deposit(double balance, double amount)throws IncorrectDenominationException
    {
        if(amount%100 !=0)
            throw new IncorrectDenominationException("---------Enter amount in multiples of 100----------");
        else{
            System.out.println("The amount successfully added. The current balance is "+(double)(balance+amount)+ "$");
            return balance + amount;
        }

    }

    public double withdraw(double balance, double amount, int i)throws InsufficientFundException, TransactionLimitExceededException
    {
        if(i > 3)
            throw new TransactionLimitExceededException("---------You have exceeded 3 transactions-----------");
        else if (amount > balance)
            throw new InsufficientFundException("-----------Insufficient balance------------");
        else
            System.out.println("The amount is successfully withdrawn. The current balance is "+(double)(balance-amount)+ "$");
            return balance - amount;
    }
}
