package Assi2;
import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sal = sc.nextDouble();
		System.out.println(sal);
		int sal1 = (int)sal;
		
		System.out.println(sal1);
		float sal2 = (float)sal;
		System.out.println(sal2);
		
		System.out.println("\nPrecision Loss:");
        System.out.println("Double - Int = " + (sal - sal1));
        System.out.println("Double - Float = " + (sal - sal2));
	}

}
