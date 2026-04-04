import java.util.*;

class Product{
    
int productId;
String productName;
String price;
Product(int productId,String productName,String price){
this.productId = productId;
this.productName = productName;
this.price=price;
}
    // Method using Wrapper Class (Double)
    public Double getPriceAsDouble() {
        try {
            return Double.valueOf(price); // conversion using wrapper class
        } catch (NumberFormatException e) {
            System.out.println("Invalid price entered!");
            return 0.0;
        }
    }
    
    public String getProductName(){
        return productName;
    }
    public String toString(){
        return productId + " " +productName +" ";
    }
}
class Order {
    private String customerName;
    private Product[] products;

    public Order(String customerName, Product[] products) {
        this.customerName = customerName;
        this.products = products;
    }

    // Normal total
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPriceAsDouble();
        }
        return total;
    }

    // Overloaded method with discount
    public double calculateTotal(double discountPercent) {
        double total = calculateTotal();
        return total - (total * discountPercent / 100);
    }

    // Generate Bill using StringBuilder
    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("\n----- BILL -----\n");
        bill.append("Customer: ").append(customerName).append("\n");

        for (Product p : products) {
            bill.append(p.toString()).append("\n");
        }

        bill.append("Total: ").append(calculateTotal()).append("\n");
        return bill.toString();
    }
}

interface Payment{
    void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println("Payment "+ amount +" done via UPI");
    }
    public void refund(double amount){
        System.out.println("Refund "+ amount +" processed to UPI");
    }
}

class CardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Payment "+ amount +" done via Card");
    }
    public void refund(double amount){
        System.out.println("Refund "+ amount +" processed to Card");
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of products: ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                throw new IllegalArgumentException("Product count must be greater than 0");
            }

            Product[] products = new Product[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter product " + (i + 1) + " details:");
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String pname = sc.nextLine();

                System.out.print("Price: ");
                String price = sc.nextLine();

                products[i] = new Product(id, pname, price);
            }

            Order order = new Order(name, products);

            System.out.println(order.generateBill());

            double total = order.calculateTotal();
            System.out.println("Final Amount: " + total);

            // Payment choice
            System.out.println("\nChoose Payment Method:");
            System.out.println("1. UPI");
            System.out.println("2. Card");

            int choice = sc.nextInt();

            Payment payment;

            switch (choice) {
                case 1:
                    payment = new UPIPayment();
                    break;
                case 2:
                    payment = new CardPayment();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid payment option");
            }

            payment.pay(total);

        } catch (NumberFormatException e) {
            System.out.println("Invalid price entered!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}