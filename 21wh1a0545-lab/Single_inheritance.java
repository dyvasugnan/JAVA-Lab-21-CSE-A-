package javalab;

public class Father {
	
	public void house() {
		System.out.println("Have Own House");
	}
}
class Son extends Father{
	public void car() {
		System.out.println("Have Own Audi Car");
	}
}
public class Single{
	public static void main(String[] args) {
		Son o = new Son();
		o.car();
		o.house();
	}
}
