package Assi2;
import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of a: ");
	        int a = sc.nextInt();

	        System.out.print("Enter value of b: ");
	        int b = sc.nextInt();

	        System.out.print("Enter value of c: ");
	        int c = sc.nextInt();

	       
	        int result1 = (a + b) * c;

	       
	        boolean result2 = (a > b) && (b > c);

	        
	        int result3 = a % b;

	        System.out.println("(a + b) * c = " + result1);
	        System.out.println("Explanation: First (a + b) is calculated, then multiplied by c");

	        System.out.println("\na > b && b > c = " + result2);
	        System.out.println("Explanation: Checks if a is greater than b AND b is greater than c");

	        System.out.println("\na % b = " + result3);
	        System.out.println("Explanation: Gives remainder when a is divided by b");

	}

}
