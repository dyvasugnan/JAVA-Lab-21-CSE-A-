package javaClass;

class C1{
	void putc1() {
		System.out.println("CLASS one");
	}
}

class C2 extends C1{
	void putc2() {
		System.out.println("CLASS two");
	}
}

class C3 extends C1{
	void putc3() {
		System.out.println("CLASS four");
	}
}

public class HierarchicalInheritance {
public static void main(String args[]) {
	//hierarchical inheritance
	C3 c=new C3();
	c.putc1();
    //c.putc2();//error-Four can not access Two here
	c.putc3();
}
}