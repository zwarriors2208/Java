package day1;

public class TestAccounts {
    public static void main(String[] args) {
        //If only parameterized constructor is provided
        //Then JVM will not provide default constructor

//        Account acc= new Account(); // default constructor
        Account acc= new Account(2122, "ankit");
        System.out.println("In main");


        //Static methods should be called as Classname.methodname
        Account.displayInterestRate();
        acc.displayDetails();
    }
}
