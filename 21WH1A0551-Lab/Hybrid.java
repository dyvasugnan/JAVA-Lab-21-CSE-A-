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
class D extends C{
	void dispD() {
		System.out.println("From class D");
	}
}

public class Hybrid{
	public static void main(String args[]) {
		B b = new B();
		C c = new C();
		D d = new D();
		b.dispB();
		b.dispA();
		c.dispC();
		c.dispA(); 		
		d.dispD();
		d.dispC();
		d.dispA();
		}
}
