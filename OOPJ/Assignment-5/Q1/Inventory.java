class Inventory<T> {
    private T product;

    // Add product
    public void addProduct(T product) {
        this.product = product;
    }

    // Retrieve product
    public T getProduct() {
        return product;
    }
}