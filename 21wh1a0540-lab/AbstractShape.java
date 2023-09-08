package classprogram;

public class AbstractShape {
public static void main(String args[]) {
	Rectangle r = new Rectangle(2,3);
	Triangle t = new Triangle(3,4);
	Circle c =  new Circle(3);
	r.printarea();
	t.printarea();
	c.printarea();
}
}
abstract class Shape{
	int n1,n2;
	abstract void printarea();
}
class Rectangle extends Shape{
	Rectangle(int l,int b){
		n1 = l;
		n2 = b;
	}
	void printarea() {
		System.out.println("The area of the rectangle is"+n1*n2);
	}
}
class Triangle extends Shape{
	Triangle(int l,int b){
		n1 = l;
		n2  = b;
	}
	void printarea() {
		System.out.println("The area of the triangle is"+(n1*n2)/2);
	}
}
class Circle extends Shape{
	Circle(int r){
		n1 = r;
	}
	void printarea() {
		System.out.println("The area of the circle is "+(3.14*n1*n1));
	}
}