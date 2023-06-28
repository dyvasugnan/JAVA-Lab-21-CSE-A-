package javaClass;

class D1{
	void putd1() {
		System.out.println("CLASS one");
	}
}

class D2 extends D1{
	void putd2() {
		System.out.println("CLASS two");
	}
}

class D4 extends D1{
	void putd4() {
		System.out.println("CLASS four");
	}
}


class D5 extends D2{
	void putd5() {
		System.out.println("CLASS five");
	}
}

public class HybridInheritance {
public static void main(String args[]) {
D5 d=new D5();
d.putd5();
d.putd2();
//d.putd4();//error-can not reference Four here
d.putd1();	
}
}
