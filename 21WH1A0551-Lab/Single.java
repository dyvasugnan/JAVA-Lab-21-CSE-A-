import java.util.*;
class A{
	void display() {
		System.out.println("Super class");
	}
}
class B extends A{
	void show() {
		System.out.println("Sub Class");
	}
}
public class Single {
	public static void main(String args[]) {
		B b = new B();
		b.display();
		b.show();
	}
}
