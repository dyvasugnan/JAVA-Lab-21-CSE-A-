package classprogram;
class A {
	void showA() {
		System.out.println("called by class B");
	}
	void show1() {
		System.out.println("Called by class c");
	}
	
}
class B extends A{
	void showB() {
		System.out.print("Derived class");
	}
}
class C extends A{
	void showC() {
		System.out.print("Class c");
	}
}
public class Hyerarical {
public static void main(String args[]) {
	C obj = new C();
	B obj1 = new B();
	obj.showA();
	obj.show1();
	
}
}
