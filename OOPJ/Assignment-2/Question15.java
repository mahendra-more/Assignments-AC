package Assi2;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Marks[][] = new int[3][3];
		int total;
        double avg;
		for(int i = 0 ; i < Marks.length ; i++)
		{
			System.out.println("Emter the marks of student "+(i+1)+" :");
			for(int j = 0 ; j < Marks[0].length ;j++)
			{
				Marks[i][j] = sc.nextInt();
			}
		}
//		for(int i = 0 ; i < Marks.length ; i++)
//		{
//			
//			for(int j = 0 ; j < Marks[0].length ;j++)
//			{
//				System.out.print(Marks[i][j]);
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 3; i++) {
            total = 0;

            System.out.print((i + 1) + "\t");

            for (int j = 0; j < 3; j++) {
                System.out.print(Marks[i][j] + "\t");
                total += Marks[i][j];
            }

            avg = total / 3.0;

            System.out.print(total + "\t" + avg);
            System.out.println();
        }
		
	}

}
