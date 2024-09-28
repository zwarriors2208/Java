package day5_asnmt;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int i = 1; //i is the counter for no of successful transactions.
        Account acc = new Account(); //making object acc of the Account class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance in your account:  ");
        double balance = sc.nextDouble();

        do {
            int choice = 0; //counter to ask continuing the banking operation
            do {
                System.out.println("Press 1 to deposit or 2 to withdraw");
                choice = sc.nextInt();
            } while (choice != 1 && choice != 2);
            // Deposition work
            if (choice == 1) {
                System.out.println("Enter the amount to deposit");
                double amount = sc.nextDouble();
                try {
                    balance = acc.deposit(balance, amount);
                } catch (IncorrectDenominationException e) {
                    System.out.println(e.getMessage());
                }
            }
            //Withdrawal work
            if (choice == 2) {
                    System.out.println("Enter the amount to withdraw");
                    double amount2 = sc.nextDouble();
                    try {
                        balance = acc.withdraw(balance, amount2, i);
                        i++; // incrementing on each successful transaction
                    } catch (TransactionLimitExceededException e) {
                        System.out.println(e.getMessage());

                    } catch (InsufficientFundException e) {
                        System.out.println(e.getMessage());
                    }
            }
            String s = "";
            do{ //asking the user if he wants to continue the banking operation
                System.out.println("Do you want to continue the banking[Y/N]");
                s = sc.next().toUpperCase();
            }while(!(s.equals("Y") || s.equals("N")));

            if (s.equals("N")) {
                break; //breaking from the loop
            }


        }while (true);



    }
}
