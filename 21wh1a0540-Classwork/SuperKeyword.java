package javaclass;

class Superk{
	int x = 5;
	int a;
	int b;
	Superk(int a,int b){
		this.a = a;
		this.b = b;
	}
	void show() {
		System.out.println("Super class");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
class Sub extends Superk{
	int x = 6;
	void show() {
		System.out.println("x in outer : "+super.x);
		System.out.println("x in inner : "+x);
		System.out.println("Sub class");
	super.show();
	}
	Sub(int x,int y){
		super(x,y);
	}
}
public class SuperKeyword {
public static void main(String args[]) {
	Sub s = new Sub(5,6);
	s.show();
}
}
