package javaprograms;

	class Shape {
	    void display() {
	        System.out.println("This is a shape.");
	    }
	}

	class Circle extends Shape {
	    void display() {
	        System.out.println("This is a circle.");
	    }
	}

	class Rectangle extends Shape {
	    void display() {
	        System.out.println("This is a rectangle.");
	    }
	}

	class Square extends Rectangle {
	    void display() {
	        System.out.println("This is a square.");
	    }
	}

	public class HybridInheritance {
	    public static void main(String[] args) {
	        Shape shape = new Shape();
	        shape.display();

	        Circle circle = new Circle();
	        circle.display();

	        Rectangle rectangle = new Rectangle();
	        rectangle.display();

	        Square square = new Square();
	        square.display();
	    }
	}

