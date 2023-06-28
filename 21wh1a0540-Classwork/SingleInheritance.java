package javaClass;

class A1{
	void puta1() {
		System.out.println("CLASS one");
	}
}

class A2 extends A1{
	void puta2() {
		System.out.println("CLASS two");
	}
}
public class SingleInheritance {
public static void main(String args[]) {
	//single level inheritance
	A2 t=new A2();
	t.puta1();
	t.puta2();
}
}