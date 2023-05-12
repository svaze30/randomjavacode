//Design a class to represent a bank account. Which include contains account number, name of the depositor, type of the account, balance
//amount in the account. Use constructors to assign initial values, to Deposit an amount, to Withdraw amount after checking balance, to
//display name and balance.
import java.util.Scanner;

class Account {
    int accountNum;
    String name;
    String accountType;
    int balance;

    Account(int accountNum, String name, String accountType, int balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit (int money) {
        balance += money;
    }

    void withdraw (int money) {
        if (money > balance) {
            System.out.println("Not enough balance");
        } else {
            balance -= money;
        }
    }
    void display () {
        System.out.println("Account Number : " + accountNum);
        System.out.println("Account Holder name : " + name);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance is : " + balance);
    }
}

public class Banking_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account svaze = new Account(2022300134, "Swaroop Ganesh Vaze", "Savings", 10000);
        int c = 0;
        while (c == 0) {
            System.out.println("Type 1 to deposit money");
            System.out.println("Type 2 to withdraw money");
            System.out.println("Type 3 to show available balance");
            System.out.println("Type anything else to exit");
            int choice = scan.nextInt();
            switch(choice) {
                case 1 -> {
                    System.out.println("Enter the money to be deposited");
                    int deposit = scan.nextInt();
                    svaze.deposit(deposit);
                    svaze.display();
                }
                case 2 -> {
                    System.out.println("Enter the money to be withdrawn");
                    int withdraw = scan.nextInt();
                    svaze.withdraw(withdraw);
                    svaze.display();
                }
                case 3 ->
                        svaze.display();
                default ->
                        c = 1;

            }

        }

    }
}
