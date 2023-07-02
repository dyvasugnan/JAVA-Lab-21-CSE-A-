package javalab;
class Shape{
	void display() {
	System.out.println("Inside shape");
	}
}
class Rectangle extends Shape {
	void area() {
		System.out.println("Inside area");
	}
}
class Cube extends Rectangle{
	void volume() {
		System.out.println("Inside volume");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Cube c = new Cube();
		c.display();
		c.area();
		c.volume();
	}
}
