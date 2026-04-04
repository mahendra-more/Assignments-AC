class Electronics {
    String name;
    double price;

    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Electronics: " + name + ", Price: " + price);
    }
}