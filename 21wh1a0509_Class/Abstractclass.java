package cs;

abstract class Shape{
	int area;
	Shape(int a){
		area = a;
		System.out.println("area: "+area);
	}
	
	abstract void Paint();
}

class Square extends Shape{
	Square(int a){
		super(a);
	}
	void paint(){
		System.out.println("Square");
	}
}
public class Abstractclass{
	public static void main(String[] args) {
		Square s=new Square(36);
		s.paint();
		Shape s1 = new Square(49);
		s1.paint();
	}
}
