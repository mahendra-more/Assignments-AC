//package Assi2;
import java.util.*;
class ATM{
	 double balance;

	    // Constructor with initial balance
	    ATM(double balance) {
	        this.balance = balance;
	    }

	    void checkBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Insufficient Balance!");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        }
	    }
	
	
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(1000); // initial balance

        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    atm.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    atm.withdraw(wit);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
	}

}
