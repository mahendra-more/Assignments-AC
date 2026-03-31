class Account {
    int accNo;
    String name;
    double balance;
    static int count = 0;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        count++;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void deposit(double amt, String mode) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (balance >= amt) balance -= amt;
        else System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println(accNo + " " + name + " Balance: " + balance);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Account a = new Account(1, "Mahendra", 1000);
        a.deposit(500);
        a.withdraw(200);
        a.display();
    }
}