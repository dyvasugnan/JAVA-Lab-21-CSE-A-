package javalab;
class A{
	void methodA() {
		System.out.println("Class A");
	}
}
class B extends A{
	void methodB() {
		System.out.println("Class B");
	}
}
class C extends A{
	void methodC() {
		System.out.println("Class C");
	}
}
class D extends A{
	void methodD() {
		System.out.println("Class D");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
		D obj3 = new D();
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();
	}
}
