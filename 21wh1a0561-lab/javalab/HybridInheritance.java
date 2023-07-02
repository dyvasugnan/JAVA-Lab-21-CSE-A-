package javalab;
class Test1{
	void display() {
		System.out.println("A");
	}
}
class Test2 extends Test1{
	void display() {
		System.out.println("B");
	}
}
class Test3 extends Test1{
	void display() {
		System.out.println("C");
	}
}
class Test4 extends Test2{
	void display() {
		System.out.println("D");
	}
}
public class HybridInheritance {
	public static void main(String args[]) {
	    Test4 obj = new Test4();
	    obj.display();
}
}
