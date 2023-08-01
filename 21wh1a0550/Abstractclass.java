package javaclasswork;
	abstract class Shape {
	    public abstract double calculateArea();

	    public void display() {
	        System.out.println("This is a shape.");
	    }
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}
	class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    public double calculateArea() {
	        return length * width;
	    }
	}

	public class Abstractclass {
	    public static void main(String[] args) {
	        Shape circle = new Circle(7);
	        Shape rectangle = new Rectangle(8, 5);
	        
	        System.out.println("Circle area: " + circle.calculateArea());
	        circle.display();

	        System.out.println("Rectangle area: " + rectangle.calculateArea());
	        rectangle.display();
	    }
	}


