package labprograms;

abstract class Shape{
	int n1,n2;
	abstract void area();
}

class Rectangle extends Shape{
	Rectangle(int l,int b){
		n1 = l;
		n2 = b;
	}
	void area() {
		System.out.println("Rectangle Area: "+n1*n2);
	}
}

class Triangle extends Shape{
	Triangle(int l1,int b1){
		n1 = l1;
		n2  = b1;
	}
	void area() {
		System.out.println("Triangle Area: "+(n1*n2)/2);
	}
}

class Circle extends Shape{
	Circle(int r){
		n1 = r;
	}
	void area() {
		System.out.println("Circle Area: "+(3.14*n1*n1));
	}
}

public class AbstractShapes {
	public static void main(String args[]) {
	Rectangle r = new Rectangle(5,1);
	Triangle t = new Triangle(1,5);
	Circle c =  new Circle(5);
	r.area();
	t.area();
	c.area();
	}
}