package classprogram;
class A{
	void showA() {
		System.out.println("Base class");
	}
	
}
class B extends A{
	void showB() {
		System.out.print("Derived class");
	}
}
public class SinIn {
public static void main(String arg[]) {
	B obj = new B();
	obj.showA();
	obj.showB();
}
}
