package Assi2;
import java.util.*;
class Expences{
	int amount;
	Expences(int amount)
	{
		this.amount = amount;
	}
}
class Calculate{
	void weekly(Expences e[])
	{
		int wa = 0;
		for (int i = 0; i < e.length; i++) {
            wa += e[i].amount;
        }
		System.out.println("Total weekly expense: " + wa);
	}
	int avg;
	void avg(Expences e[])
	{
		int sum = 0;

        for (int i = 0; i < e.length; i++) {
            sum += e[i].amount;
        }

        double avg = (double) sum / e.length;
        System.out.println("Average expense: " + avg);
	}
	void highest(Expences e[])
	{
		 int max = e[0].amount;

	        for (int i = 1; i < e.length; i++) {
	            if (e[i].amount > max) {
	                max = e[i].amount;
	            }
	        }

	        System.out.println("Highest expense: " + max);
	}
	void lowest(Expences e[])
	{
		 int min = e[0].amount;

	        for (int i = 1; i < e.length; i++) {
	            if (e[i].amount < min) {
	                min = e[i].amount;
	            }
	        }

	        System.out.println("Lowest expense: " + min);
	}
}
public class Question9 {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);

	        Expences e[] = new Expences[7];

	        System.out.println("Enter expenses for 7 days:");

	        for (int i = 0; i < 7; i++) {
	            int amt = sc.nextInt();
	            e[i] = new Expences(amt);
	        }
	        Calculate c = new Calculate();
	        c.weekly(e);
	        c.avg(e);
	        c.highest(e);
	        c.lowest(e);
	}
}
