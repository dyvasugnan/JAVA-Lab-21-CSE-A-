
class BaseClass {
int a;
}
class Parent1 extends BaseClass {
	int b;
	Parent1(){
		a=5;
		b=6;
	}
	void show1() {
		System.out.println("sum : "+(a+b));
	}
}
class Parent2 extends BaseClass{
	int c;
	Parent2(){
		a = 5;
		c = 10;
	}
	void show2() {
		System.out.println("sum :"+(a+c));
	}
}
class Cderived extends Parent1{
	int d;
	Cderived(){
		a=1;
		b=3;
		d=4;
	}
	void show3() {
		System.out.println("sum : "+(a+b+d));
	}
}
public class Hybrid{
	public static void main(String args[]) {
		Parent1 obj1 = new Parent1();
		obj1.show1();
		Parent2 obj2 = new Parent2();
		obj2.show2();
		Cderived obj3 = new Cderived();
		obj3.show3();
	}
}
