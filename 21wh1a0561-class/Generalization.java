package javalab;
class A {
    void m1() {
        System.out.println("Superclass method");
    }
}

class B extends A {
    void m2() {
        System.out.println("Subclass method");
    }
}
public class Generalization {
	public static void main(String[] args) {
        A a; 
        a = (A) new B();
        a.m1();
    }
}
