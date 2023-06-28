package moulikaLab;

class A{
	int i=10;
	void display1() {
		System.out.println("SuperClass: "+i);
	}
}
class B extends A{
	int j=20;
	void display2() {
		System.out.println("SubClass: "+j);
	super.display1();
	}
}
class Three extends B{
	int k=30;
	void display3() {
		System.out.println("Sub-Sub Class: "+k);
	
	super.display2();
	}
}


public class Multilevel {

	public static void main(String[] args) {
		Three t = new Three();
		t.display3();
	}

}
