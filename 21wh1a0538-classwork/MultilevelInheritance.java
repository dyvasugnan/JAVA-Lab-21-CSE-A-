package classprogram;
public class MultilevelInheritance {
public static void main(String args[]) {
	C obj = new C();
	obj.showA();
	obj.showB();
	obj.showC();
}
}
class A{
	void showA() {
		System.out.println("Base class");
	}
}
class B extends A{
	void showB() {
		System.out.println("Derived 1");
	}
}
class C extends B{
	void showC() {
		System.out.println("Derived 2");
	}
}

