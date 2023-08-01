package java_lab;
import java.lang.*;
class Super{
	void display() {
		System.out.println("Super Class");
	}
}
class Sub extends Super{
	void display() {
		System.out.println("Sub Class");
	}
}
public class MethodOverriding {
	public static void main(String args []) {
		Super s = new Super();
		s.display();
		Sub ss = new Sub();
		ss.display();
	}

}
