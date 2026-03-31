class Vehicle {
    String brand;
    int speed;

    static {
        System.out.println("System Initialized");
    }

    {
        System.out.println("Vehicle Created");
    }

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void updateSpeed(int speed) {
        this.speed = speed;
    }

    void display() {
        System.out.println(brand + " Speed: " + speed);
    }
}

class Car extends Vehicle {
    String fuel;

    Car(String brand, int speed, String fuel) {
        super(brand, speed);
        this.fuel = fuel;
    }
}

class Bike extends Vehicle {
    int mileage;

    Bike(String brand, int speed, int mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car c = new Car("BMW", 120, "Petrol");
        c.display();
    }
}