//package Assi2;
import java.util.*;
class Employee{
	String empname;
	int ID;
	int sal;
	Employee(String empname , int ID , int sal)
	{
		this.empname = empname;
		this.ID = ID;
		this.sal = sal;
	}
	double HRA;
	double DA;
	double PF;
	double netsal;
	void netSalCal()
	{
		HRA = sal * .20;
		DA = sal * .10;
		PF = sal * .08;
		netsal = HRA + DA + sal - PF;
	}
	void print()
	{
		System.out.println("salary :"+sal);
		System.out.println("HRA :"+HRA);
		System.out.println("DA :"+DA);
		System.out.println("PF :"+PF);
		System.out.println("NetSalary :"+netsal);
		
	}
}
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String empname = sc.nextLine();
		int ID = sc.nextInt();
		int sal = sc.nextInt();
		Employee e1 = new Employee(empname , ID , sal);
		e1.netSalCal();
		e1.print();
		
	}

}
