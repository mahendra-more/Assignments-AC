package Assi2;
import java.util.*;
class busBooking{
	Scanner sc = new Scanner(System.in);
	int seats[] = new int[10];
	busBooking(){
		for(int i = 0 ; i < seats.length ; i++)
		{
			seats[i] = 0;
		}
	}
	
	void bookSeat()
	{
		System.out.println("Enter seat no: ");
		int seatno = sc.nextInt();
		for(int i = 0 ; i < seats.length ; i++)
		{
			if(i == seatno)
			{
				if(seats[i] != 1)
				{
					seats[i] = 1;
					System.out.println("your seat "+i + "is Booked");
				}
				else {
					System.out.println("seat is already booked please choose another seat");
				}
			}
		}
	}
	void cancelSeat()
	{
		System.out.println("Enter seat no: ");
		int seatno = sc.nextInt();
		for(int i = 0 ; i < seats.length ; i++)
		{
			if(i == seatno)
			{
				seats[seatno] = 0;
				System.out.println("your seat "+i + "is canceled");
			}
		}
	}
	void viewAviaSeats()
	{
		int count = 0;
		for(int i = 0 ; i < seats.length ; i++)
		{
			if(seats[i] == 0)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		busBooking b = new busBooking();
		//busBooking b2 = null;
		int choice;
		
		do {
			System.out.println("============================Welcome to bus booking==========================================");
			System.out.println("press 1 to view available seats");
			System.out.println("press 2 to book seats");
			System.out.println("press 3 to cancel the seat");
			System.out.println("press 4 to exit");
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			b.viewAviaSeats();
			break;
		case 2:
			b.bookSeat();
			break;
		case 3:
			b.cancelSeat();
			break;
		case 4:
			System.out.print("Thank you");
			break;
			
		}
	}while(choice != 4);

}
}
