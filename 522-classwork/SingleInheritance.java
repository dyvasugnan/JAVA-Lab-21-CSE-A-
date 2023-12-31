package javaclass;
public class SingleInheritance {
	public static void main(String[] args) {
        A a = new A();
        a.display(); // Output: Value of x: 10
       
        B b = new B();
        b.display(); // Output: Value of x: 10, Value of y: 20
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
        System.out.println("Value of x: "  + x  );
        System.out.println("Value of y: " + y);
    }
}
