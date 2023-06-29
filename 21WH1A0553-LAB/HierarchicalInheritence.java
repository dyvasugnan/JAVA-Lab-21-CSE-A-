package clss;

class Vehicle {
    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
}
class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}
class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Motorcycle is riding");
    }
}

public class HierarchicalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
        car.accelerate(); 
        car.drive();      

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.accelerate(); 
        motorcycle.ride();    

	}

}
