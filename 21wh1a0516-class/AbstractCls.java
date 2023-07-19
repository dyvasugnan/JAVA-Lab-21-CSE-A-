package cs;

abstract class Shape{
	int area;
	Shape(int a){
		area = a;
		System.out.println("area: "+area);
	}
	
	abstract void draw();
}

class Square extends Shape{
	Square(int a){
		super(a);
	}
	void draw(){
		System.out.println("Square figure");
	}
}
public class AbstractCls {
	public static void main(String[] args) {
		Square s=new Square(16);
		s.draw();
		//downcasting
		Shape s1 = new Square(25);
		s1.draw();
	}
}
