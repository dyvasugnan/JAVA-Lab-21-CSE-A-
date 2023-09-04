package javaclass;
import java.util.*;
abstract class Myclass {
		public abstract void area();
}
class Rectangle extends Myclass {
	int a,b;
	Rectangle(int x,int y) {
		a=x;
		b=y;
	}
	public void area(){
		System.out.println("Area:"+a*b);
	}
}
class Triangle extends Myclass {
	int a,b;
	Triangle(int x,int y) {
		a=x;
		b=y;
	}
	public void area() {
		System.out.println("Area:"+0.5*a*b);
	}
}
class Circle extends Myclass {
	int a;
	Circle(int x) {
		a=x;
	}
	public void area() {
		System.out.println("Area:"+3.14*a*a);
	}
}
public class Shape{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Rectangle r = new Rectangle(x,y);
		r.area();
		Triangle t = new Triangle(x,y);
		Circle c = new Circle(x);
		t.area();
		c.area();
	}	
}

