package Assi2;

public class Question17 {
	 void methodExample() {
	        int a = 10; // 🔹 method scope
	        System.out.println("Method variable a = " + a);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
            int b = 20;
            System.out.println("Block variable b = " + b);
        }
        // System.out.println(b);  ERROR: b not visible outside block

        // 🔹 Loop scope
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop variable i = " + i);
        }
        // System.out.println(i);  ERROR: i not visible outside loop

        // Method scope
        //int a = methodExample();

        // System.out.println(a);  ERROR: a not visible outside method

	}

}
