package Assi2;
public class Question11 {
	static int calculate(int a , int b)
	{
		return a+b;
	}
	static double calculate(double a , double b)
	{
		return a+b;
	}
	static int calculate(int a , int b , int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1 = calculate(10 , 10);
		double s2 = calculate(10.2,10.2);
		int s3 = calculate(10,20,30);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
