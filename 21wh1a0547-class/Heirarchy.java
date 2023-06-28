package java_lab;
class First{
	int a=5;
	void display() {
		System.out.println(a);
	}
}
class Second extends First{
	void display1() {
		super.display();
		System.out.println(a*a);
	}
}
class Third extends First{
	void display2() {
		super.display();
		System.out.println(a*a*a);
	}
}
public class Heirarchi {
	public static void main(String args[]) {
		Third t = new Third();
		t.display2();
		Second s = new Second();
		s.display1();

	}

}
