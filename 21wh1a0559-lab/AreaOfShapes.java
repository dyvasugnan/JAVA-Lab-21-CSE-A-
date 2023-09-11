class Triangle extends Shape{
	Triangle(int l,int b){
		n1 = l;
		n2  = b;
	}
	void area() {
		System.out.println("The area of the triangle is"+(n1*n2)/2);
	}
}
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
		System.out.println("The area of the rectangle is"+n1*n2);
	}
}
class Circle extends Shape{
	Circle(int r){
		n1 = r;
	}
	void area() {
		System.out.println("The area of the circle is "+(3.14*n1*n1));
	}
}
public class AbstractShape {
  public static void main(String args[]) {
    Triangle t = new Triangle(4,5);
  	Rectangle r = new Rectangle(4,3);	
  	Circle c =  new Circle(5);
  	t.area();
  	r.area();
  	c.area();
  }
}
