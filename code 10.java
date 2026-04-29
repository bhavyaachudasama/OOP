public class BankAccount {

    
    String account_holder_name;
    double balance;

    
    static double interest_rate = 5.0; // default 5%

    
    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    
    void displayDetails() {
        System.out.println("\nAccount Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }

    
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("\nInterest rate updated to: " + interest_rate + "%");
    }

    
    public static void main(String[] args) {

        
        BankAccount acc1 = new BankAccount("Bhavya", 10000);
        BankAccount acc2 = new BankAccount("Rahul", 20000);

        
        System.out.println("Before updating interest rate:");
        acc1.displayDetails();
        acc2.displayDetails();

        
        BankAccount.updateInterestRate(7.5);

       
        System.out.println("\nAfter updating interest rate:");
        acc1.displayDetails();
        acc2.displayDetails();
    }
}