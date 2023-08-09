package javalab;
import java.util.Scanner;

class Area {
    private double radius;
    private double length;
    private double width;
    
    // Constructor
    public Area(double radius, double length, double width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area of circle
    public double carea() {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate area of rectangle
    public double rarea() {
        return length * width;
    }
}

public class AreaCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        Area areaCalculator = new Area(radius, length, width);
        
        double circleArea = areaCalculator.carea();
        double rectangleArea = areaCalculator.rarea();
        
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        
        scanner.close();
    }
}
