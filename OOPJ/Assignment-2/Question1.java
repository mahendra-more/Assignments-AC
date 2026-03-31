//package Assi2;
import java.util.*;
class Bill{
	String name ;
	int cNo;
	int units;
	double total;
	
	Bill(String name , int cNo , int units)
	{
		this.name = name;
		this.cNo = cNo;
		this.units = units;
	}
	void billingAmount(int units){
		if(units <= 100) {
			total = units * 5;
		}
		else if(units > 100 && units <= 200)
		{
			total = (100 * 5) + (100 - units)*7;
		}
		else {
			total = (100 * 5) + (100 * 7) +(units - 200 )*10;
 		}
		double discount = 0;
		if(total > 1500)
		{
			discount = total * .5;
			total = discount + total;
		}
		System.out.println("your total bill is :" + total);
	}
	void printdata()
	{
		System.out.println("Name:"+name);
		System.out.println("consumer number:" +cNo);
		System.out.println("units consumed:" +units);	
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello Omkar");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int cNo = sc.nextInt();
		int units = sc.nextInt();
		Bill b = new Bill(name , cNo , units);
		b.printdata();
		b.billingAmount(b.units);
		
		
	}
}
