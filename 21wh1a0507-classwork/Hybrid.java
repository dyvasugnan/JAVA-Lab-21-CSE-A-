package java_codes;
class Base_class {
    public void display1() {
        System.out.println("Base class");
    }
}

class DerivedA extends Base_class {
    public void display2() {
        System.out.println("Derived class A");
    }
}

class DerivedB extends Base_class {
    public void display3() {
        System.out.println("Derived class B");
    }
}

class New_d extends DerivedA {
    public void display4() {
        System.out.println("Hybrid class");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        New_d obj = new New_d();
        obj.display1();
        obj.display2();
        obj.display4();

        DerivedB derivedB = new DerivedB();
        derivedB.display1();
        derivedB.display3();
    }
}
