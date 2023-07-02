package javalab;
class Base{
	int a;
}
class Derived extends Base{
	int b;
	Derived(){
		a=10;
		b=20;
	}
	void sum() {
		System.out.print("sum : "+(a+b));
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.sum();
	}
}
