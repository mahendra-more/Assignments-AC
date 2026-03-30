package Assi2;
import java.util.*;
class Recharge{
	String mobNo;
	int amount;
	int validity;
	void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Number: ");
        mobNo = sc.nextLine();

        System.out.print("Enter Recharge Amount: ");
        amount = sc.nextInt();
    }
	
	void processRecharge() {
        switch (amount) {
            case 199:
                validity = 28;
                break;
            case 399:
                validity = 56;
                break;
            case 599:
                validity = 84;
                break;
            default:
                System.out.println("Invalid Recharge Plan!");
                validity = 0;
        }
    }
	void display() {
        if (validity != 0) {
            System.out.println("\n===== Recharge Successful =====");
            System.out.println("Mobile Number : " + mobNo);
            System.out.println("Recharge Amount : Rs. " + amount);
            System.out.println("Validity : " + validity + " days");
        }
    }
}
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recharge m = new Recharge();

        m.getInput();
        m.processRecharge();
        m.display();
	}

}
