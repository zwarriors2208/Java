package day10;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        synchronized(this) {
            if (this.balance < amount) {
                try {
                    System.out.println("Insufficient balance. Waiting for deposit.....................");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.balance -= amount;
            System.out.println("The amount is withdrawn successfully.\n The current balance is " + this.balance);
        }
    }

    public void deposit(double amount){
        synchronized(this) {
            this.balance += amount;
            System.out.println("The amount is deposited successfully.\n The current balance is " + this.balance);
            notify();
        }
    }

    public static void main(String[] args) {
        Account account  = new Account(1000);
        Thread thread1 = new Thread(() -> {
            account.withdraw(2000);

        });


        Thread thread2 = new Thread(() -> {
            account.deposit(1000);

        });
        thread1.start();
        thread2.start();

    }
}
