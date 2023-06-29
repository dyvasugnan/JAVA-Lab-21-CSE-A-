package classprogram;
class A {
	void show1() {
		System.out.println("Grandfather");
	}
}
class B extends A{
	void show2() {
		System.out.println("Father");
	}
}
class C extends B{
	void show3() {
		System.out.println("Son");
	}
}
class D extends B{
	void show4() {
		System.out.println("Daughter");
	}
}
public class Hybrid {
public static void main(String args[]) {
	D obj = new D();
   obj.show1();
   obj.show2();
   obj.show4();
	
}
}
