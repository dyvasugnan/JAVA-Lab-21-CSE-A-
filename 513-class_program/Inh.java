package javalab;
class A{
	int i=10;
	void showA() {
		System.out.println("This is class A");
	}
}

class B extends A{
	void showB(){
		System.out.println("This is class B");
	}
}

class C extends B{
	void show3() {
		System.out.println("This is class C");
	}
}

public class Inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B o = new B();  //single level inheritance
		o.showB();
		o.showA();
		C t = new C(); //multi level inheritance
		t.showA();
		t.showB();
		t.show3();

	}

}
