import java.util.*;
class Account{
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Constructor (String to double using Wrapper class)
    public Account(int accountNumber, String accountHolderName, String balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        try {
            this.balance = Double.valueOf(balance); // Wrapper class
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance input!");
            this.balance = 0.0;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount extends Account implements BankService {

    public SavingsAccount(int accNo, String name, String balance) {
        super(accNo, name, balance);
    }

    // Method Overriding
    public void displayAccountDetails() {
        System.out.println("\n--- Savings Account ---");
        super.displayAccountDetails();
    }

    // Deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
    }

    // Overloaded Deposit
    public void deposit(double amount, double bonus) {
        deposit(amount);
        balance += bonus;
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }
}


class CurrentAccount extends Account implements BankService{

}









public class Main1 {
    
}
