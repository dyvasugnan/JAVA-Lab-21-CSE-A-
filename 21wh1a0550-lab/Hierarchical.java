package javalab;
class Vehicle {
    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is being driven.");
    }
}

class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Motorcycle is being ridden.");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Vehicle started.
        car.drive(); // Output: Car is being driven.
        car.stop(); // Output: Vehicle stopped.

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start(); // Output: Vehicle started.
        motorcycle.ride(); // Output: Motorcycle is being ridden.
        motorcycle.stop(); // Output: Vehicle stopped.
    }
}