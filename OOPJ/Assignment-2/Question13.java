package Assi2;
class BankAccount{
	int accno;
	String name;
	double bal;
	
	BankAccount()
	{
		accno = 0;
		name = "Not Assigned";
		bal = 0.0;
	}
	BankAccount(int accno , String name , double bal)
	{
		this.accno = accno;
		this.name = name;
		this.bal = bal;
	}
	void display()
	{
		System.out.println("Account no : "  + accno);
		System.out.println("Name :" +name);
		System.out.println("Balance :" +bal);
	}
	
}
public class Question13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount(121,"om",12121.1);
		b1.display();
		b2.display();
	}

}
