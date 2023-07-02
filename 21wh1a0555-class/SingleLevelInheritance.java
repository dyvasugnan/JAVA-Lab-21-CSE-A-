package hello;
import java.lang.*;
import java.util.*;
class SingleLevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass();
		s.display();
		s.display1();

	}

}
class SuperClass{
	void display() {
		System.out.println("Superclass");
	}
}
class SubClass extends SuperClass{
	void display1() {
		System.out.println("Subclass");
	}
}