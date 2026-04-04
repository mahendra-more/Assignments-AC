public class Main {
    public static void main(String[] args) {

        // Electronics Inventory
        Inventory<Electronics> eInventory = new Inventory<>();
        Electronics e1 = new Electronics("Laptop", 75000);
        eInventory.addProduct(e1);

        Electronics eProduct = eInventory.getProduct();
        eProduct.display();

        // Clothing Inventory
        Inventory<Clothing> cInventory = new Inventory<>();
        Clothing c1 = new Clothing("Nike", 42);
        cInventory.addProduct(c1);

        Clothing cProduct = cInventory.getProduct();
        cProduct.display();
    }
}