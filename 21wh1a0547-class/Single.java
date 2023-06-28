package java_lab;
class A{
	int a=10;
}
class B extends A{
	void show() {
		System.out.println(a);
	}
}
public class Single {
	public static void main(String args[]) {
		B b = new B();
		b.show();
	}
	

}
