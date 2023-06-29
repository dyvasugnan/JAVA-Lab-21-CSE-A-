package clss;

class Shape {
    public void display() {
        System.out.println("Shape is being displayed");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle is being drawn");
    }
}
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Rectangle is being drawn");
    }
}
class Square extends Circle {
    public void draw() {
        System.out.println("Square is being drawn");
    }
}

public class HybridInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
        square.display(); 
        square.draw();    
        Rectangle rectangle = new Rectangle();
        rectangle.display(); 
        rectangle.draw(); 

	}

}
