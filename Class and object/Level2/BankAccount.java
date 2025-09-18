public class BankAccount {
    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Method to deposit money
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
        System.out.println("------------------------");
    }
    
    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrawn $" + amount);
                System.out.println("Remaining balance: $" + balance);
            } else {
                System.out.println("Insufficient balance. Current balance: $" + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
        System.out.println("------------------------");
    }
    
    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating bank account object
        BankAccount account = new BankAccount("John Doe", "ACC123456", 1000.0);
        
        // Testing ATM operations
        account.displayBalance();
        account.depositMoney(500.0);
        account.withdrawMoney(200.0);
        account.withdrawMoney(1500.0); // This should show insufficient balance
        account.displayBalance();
    }
}