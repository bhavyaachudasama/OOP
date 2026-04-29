import java.util.Scanner;
class BankAccount {
    
    String accountNumber;
    String accountHolderName;
    double balance;

    
    void openAccount(String accNo, String name, double initialDeposit) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialDeposit;
        System.out.println("Account opened successfully!");
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


class SavingAccount extends BankAccount {

    double interestRate = 5.0; // example interest rate

    
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Savings Interest: " + interest);
    }
}


class FixedDepositAccount extends BankAccount {

    double interestRate = 7.0;
    int years = 3;

    
    void maturityAmount() {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}


public class BankSystem {
    public static void main(String[] args) {

       
        SavingAccount sa = new SavingAccount();
        sa.openAccount("S101", "Bhavya", 10000);
        sa.deposit(5000);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("\n----------------------\n");

       
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD202", "Rahul", 20000);
        fd.checkBalance();
        fd.maturityAmount();
    }
}