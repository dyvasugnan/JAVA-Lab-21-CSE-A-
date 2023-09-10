package java;

abstract class Shape { 
	int a=10;	
	int b=20;
	int r=2;
	int h=10;
	public abstract void m1();
}
class rectangles extends Shape{
	public void m1() {
		System.out.print("Area of rectangle : "); 
		System.out. println(a*b);
	} 
}
class circle extends Shape{ 
	public void m1() {
		System.out.print("Area of circle"); 
		System . out . println (3.14*r*r );
	} 
}
class triangle extends Shape{
	public void m1() {
		System.out.print("Area of triangle : "); 
		System.out.println(0.5*b*h);
	}
}
public class AbstractClass{
	public static void main(String args []) { 
		rectangles r =new rectangles (); 
		circle c=new circle ();
		triangle t=new triangle ();
		r.m1(); 
		c.m1();
		t.m1();
	}
}
		
