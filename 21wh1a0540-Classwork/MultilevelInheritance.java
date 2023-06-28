package javaClass;

class B1{
	void putb1() {
		System.out.println("CLASS one");
	}
}

class B2 extends B1{
	void putb2() {
		System.out.println("CLASS two");
	}
}
class B3 extends B2{
	void putb3() {
		System.out.println("CLASS three");
	}
}
public class MultilevelInheritance {
public static void main(String args[]) {
	//single level inheritance
	B3 t=new B3();
	t.putb1();
	t.putb2();
	t.putb3();
	}
}