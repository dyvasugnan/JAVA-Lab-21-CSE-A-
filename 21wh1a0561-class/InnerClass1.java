package javalab;
class Outer{
	void display() {
		System.out.println("Outer class");
	}
	class Inner{
		void display2() {
			System.out.println("Inner class");
		}
	}
}
public class InnerClass1 {
public static void main(String args[]) {
	Outer o = new Outer();
	Outer.Inner s = new Outer().new Inner();
	s.display2();
	o.display();
}
}