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

class Generalization {
    public static void main(String[] args) {
        A a; // a is reference variable of superclass
        a = (A) new B();
        a.m1();
    }
}
