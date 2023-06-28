package javaclass;
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
	
	public class HierarchialInheritance {
		   public static void main(String[] args) {
		        B b = new B();
		        b.display(); //Value of x: 10, Value of y: 20
		       
		        C c = new C();
		        c.display(); //Value of x: 10, Value of z: 30
		    }
	}




