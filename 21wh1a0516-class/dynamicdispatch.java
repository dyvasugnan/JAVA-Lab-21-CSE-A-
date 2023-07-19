package cs;

class A{
	void m1(){
		System.out.println("inside A");
	}
}
class B extends A{
	void m1(){
		System.out.println("inside B");
	}
	
}

class C extends B{
	void m1(){
		System.out.println("inside C");
	}
}	
public class dynamicdispatch {
	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		obj = new B();
		obj.m1();
		obj = new C();
		obj.m1();
		

	}
	
}
