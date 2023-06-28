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
class C extends A{
	void dispC() {
		System.out.println("From class C");
	}
}
public class Hierarchal {
	public static void main(String args[]) {
	B b = new B();
	C c = new C();
	b.dispB();
	b.dispA();
	c.dispC();
	c.dispA();
	}
}
