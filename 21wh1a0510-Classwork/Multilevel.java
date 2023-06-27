
class First {
int a;
}
class Parent extends First{
	int b;
}

class Child extends Parent{
	int c;
	Child(){
		a=10;
		b=20;
		c=30;
	}
	void sum() {
		System.out.println("sum : "+(a+c+b));
	}
}
public class Multilevel{
	public static void main(String args[]) {
		Child obj = new Child();
		obj.sum();
	}
}