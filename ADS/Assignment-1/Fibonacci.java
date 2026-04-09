public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative index not allowed");
        }
        if (n == 0) return 0; // base case
        if (n == 1) return 1; // base case
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive step
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci of 6: " + fibonacci(6));
    }
}
