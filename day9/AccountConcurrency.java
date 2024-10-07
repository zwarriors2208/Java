package day9;

public class AccountConcurrency {
    public static void main(String[] args) {
        WithdrawJob job = new WithdrawJob();
        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        t1.setName("Ankit");
        t2.setName("Kangana");
        t1.start();
        t2.start();

    }
}
