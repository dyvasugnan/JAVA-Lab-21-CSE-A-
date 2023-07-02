class Base {
int a;
}
class Derived1 extends Base{
	int b;
	Derived1(){
		a=10;
		b=20;
	}
	void show1() {
		System.out.println("sum : "+(a+b));
	}
}
class Derived2 extends Base{
	int c;
	Derived2(){
		a=30;
		c=40;
	}
	void show2() {
		System.out.println("sum : "+(a+c));
	}
}

public class Hierarchial{
	public static void main(String args[]) {
	Derived1 obj1 = new Derived1();
	obj1.show1();
	Derived2 obj2 = new Derived2();
	obj2.show2();
}
}
