package javaclass;
public class HybridInheritance {
public static void main(String[] args) {
	        A a = new A();
	       // a.display(); //Value of x: 10
	        B b = new B();
	        // b.display(); //Value of x: 10, Value of y: 20
	        C c = new C();
	        // c.display(); // Value of x: 10, Value of z: 30
	        D d = new D();
	         d.display(); //Value of x: 10, Value of y: 20, Value of w: 40
	    }
	}
	class A {
	    int x = 10;
	    void display() {
	        System.out.println("Value of x: " + x);
	    }
	}
	class B extends A {
	    int y = 20;
	    void display() {
	        System.out.println("Value of x: " + x);
	        System.out.println("Value of y: " + y);
	    }
	}
	class C extends A {
	    int z = 30;
	    void display() {
	        System.out.println("Value of x: " + x);
	        System.out.println("Value of z: " + z);
	    }
	}

	class D extends B {
	    int w = 40;
	    void display() {
	        System.out.println("Value of x: " + x);
	        System.out.println("Value of y: " + y);
	        System.out.println("Value of w: " + w);
	    }
	}

