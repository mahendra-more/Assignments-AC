class Clothing {
    String brand;
    int size;

    Clothing(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    void display() {
        System.out.println("Clothing: " + brand + ", Size: " + size);
    }
}