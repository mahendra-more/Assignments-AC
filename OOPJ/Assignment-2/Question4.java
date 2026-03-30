package Assi2;
import java.util.*;
class Grocery {
    String items;
    int quanity;
    double price;
    double total;

    Grocery(String items, int quantity, double price) {
        this.items = items;
        this.quanity = quantity;
        this.price = price;
        this.total = price * quantity;
    }
}
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Grocery gs[] = new Grocery[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1));

            System.out.print("Enter the name: ");
            String items = sc.next();

            System.out.print("Enter the Quantity: ");
            int quanity = sc.nextInt();

            System.out.print("Enter the price: ");
            double price = sc.nextDouble();

            gs[i] = new Grocery(items, quanity, price);
        }

        // Calculate total
        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            grandTotal += gs[i].total;
        }

        // Discount
        double discount = 0;
        if (grandTotal > 3000) {
            discount = grandTotal * 0.10;
        }

        double finalAmount = grandTotal - discount;

        // Print Bill
        System.out.println("\n====== BILL ======");
        System.out.println("Item\tQuantity\tPrice\tTotal");

        for (int i = 0; i < n; i++) {
            System.out.println(gs[i].items + "\t" + gs[i].quanity + "\t\t" +
                    gs[i].price + "\t" + gs[i].total);
        }

        System.out.println("----------------------");
        System.out.println("Grand Total: " + grandTotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalAmount);
	}

}
