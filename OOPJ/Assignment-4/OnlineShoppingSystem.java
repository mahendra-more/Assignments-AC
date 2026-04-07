import java.util.*;

class Product {
    int productId;
    String productName;
    String price; // input as String

    Product(int productId, String productName, String price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Convert String price to double using Wrapper class
    double getPrice() throws NumberFormatException {
        return Double.parseDouble(price);
    }
}

class Order {
    String customerName;
    Product[] products;

    Order(String customerName, Product[] products) {
        if (products.length <= 0) {
            throw new IllegalArgumentException("Product count must be greater than 0");
        }
        this.customerName = customerName;
        this.products = products;
    }

    // Normal total
    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    // Overloaded method with discount
    double calculateTotal(double discountPercent) {
        double total = calculateTotal();
        return total - (total * discountPercent / 100);
    }

    // Generate bill using StringBuilder
    String generateBill(double finalAmount) {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customerName).append("\n");
        sb.append("Products:\n");
        for (Product p : products) {
            sb.append(p.productName).append(" - Rs. ").append(p.price).append("\n");
        }
        sb.append("Total Payable: Rs. ").append(finalAmount).append("\n");
        return sb.toString();
    }
}

// Payment interface
interface Payment {
    void pay(double amount);
    void refund(double amount);
}

// UPI Payment
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via UPI.");
    }
    public void refund(double amount) {
        System.out.println("Refunded Rs. " + amount + " via UPI.");
    }
}

// Card Payment
class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via Card.");
    }
    public void refund(double amount) {
        System.out.println("Refunded Rs. " + amount + " via Card.");
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter number of products: ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) throw new IllegalArgumentException("Invalid product count!");

            Product[] products = new Product[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter product id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter product name: ");
                String name = sc.nextLine();
                System.out.print("Enter product price: ");
                String price = sc.nextLine();
                products[i] = new Product(id, name, price);
            }

            Order order = new Order(customerName, products);

            System.out.print("Enter discount percentage (0 if none): ");
            double discount = sc.nextDouble();

            double finalAmount = (discount > 0) ? order.calculateTotal(discount) : order.calculateTotal();

            System.out.println(order.generateBill(finalAmount));

            System.out.println("Choose payment method: 1. UPI  2. Card");
            int choice = sc.nextInt();

            Payment payment;
            if (choice == 1) {
                payment = new UPIPayment();
            } else if (choice == 2) {
                payment = new CardPayment();
            } else {
                throw new IllegalArgumentException("Invalid payment option!");
            }

            payment.pay(finalAmount);
            System.out.println("Payment Successful!");

        } catch (NumberFormatException e) {
            System.out.println("Invalid price format!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}