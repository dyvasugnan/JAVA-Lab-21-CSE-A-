import java.util.*;
class A{
	void dispA() {
		System.out.println("From class A");
	}
}
class B extends A{
	void dispB() {
		System.out.println("From class B");
	}
}
class C extends B{
	void dispC() {
		System.out.println("From class C");
	}
}
public class Multilevel {
	public static void main(String args[]) {
	C c = new C();
	c.dispC();
	c.dispB();
	c.dispA();
	}
}
