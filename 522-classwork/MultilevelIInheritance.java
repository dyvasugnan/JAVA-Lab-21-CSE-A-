package javaclass;
public class MultilevelIInheritance {
	public static void main(String[] args) {
        C c = new C();
        c.display(); //Value of x: 10, Value of y: 20, Value of z: 30
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

class C extends B {
    int z = 30;
    void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
