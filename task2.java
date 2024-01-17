// Create a class called BankAccount with the following attributes and methods:

// Attributes: accountNumber (String), accountHolder (String), balance (double).
// Methods:
// deposit(double amount) method that adds the specified amount to the balance.
// withdraw(double amount) method that subtracts the specified amount from the balance.
// getBalance() method that returns the current balance.
// toString() method that provides a string representation of the account.
// Implement a constructor for the BankAccount class to initialize the accountNumber, accountHolder, and balance.

// Create an instance of the BankAccount class, set some initial values, and perform a few deposits and withdrawals.

// Print out the details of the account, including the current balance, using the toString() method.


public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.0);

        // Deposit and withdraw some money
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);

        // Display account details
        System.out.println(myAccount.toString());
    }
}
