package java_labcodes;
class Base {
    public void display1() {
        System.out.println("This is the base class");
    }
}

class Derived extends Base {
    public void display2() {
        System.out.println("This is the derived class");
    }
}

class SubDerived extends Derived {
    public void display3() {
        System.out.println("This is the sub-derived class");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        SubDerived s = new SubDerived();
        s.display1();
        s.display2();
        s.display3();
    }
}
