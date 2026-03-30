package Assi2;
import java.util.*;
class Result{
	String name;
    int rollNo;
    int m1, m2, m3, m4, m5;
    int total;
    double average, percentage;
	Result(String name,int rollNo , int m1,int m2,int m3 , int m4,int m5){
		this.name = name;
		this.rollNo = rollNo;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}
	void grade(int m1,int m2,int m3 , int m4,int m5)
	{
		 total = m1 + m2 + m3 + m4 + m5;
	        average = total / 5.0;
	        percentage = average;

	        System.out.println("\n--- Student Result ---");
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average: " + average);
	        System.out.println("Percentage: " + percentage);
		 if (percentage >= 90) {
	            System.out.println("Grade: A");
	        } 
	        else if (percentage >= 75) {
	            System.out.println("Grade: B");
	        } 
	        else if (percentage >= 60) {
	            System.out.println("Grade: C");
	        } 
	        else if (percentage >= 40) {
	            System.out.println("Grade: D");
	        } 
	        else {
	            System.out.println("Grade: Fail");
	        }
		 if (m1 >= 40 && m2 >= 40 && m3 >= 40 && m4 >= 40 && m5 >= 40) {
	            System.out.println("Status: PROMOTED");
	        } else {
	            System.out.println("Status: NOT PROMOTED");
	        }
	}
}
public class Question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int rollNo = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		Result r = new Result(name , rollNo , m1,m2,m3,m4,m5);
		r.grade(m1, m2, m3, m4, m5);
		
	}

}
