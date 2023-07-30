package java_codes;
class B {
    public void display1() {
        System.out.println("Base class");
    }
}

class D extends B {
    public void display2() {
        System.out.println("Derived class");
    }
}

class SD extends D {
    public void display3() {
        System.out.println("Sub-derived class");
    }
}

public class Multilevel {
	public static void main(String[] args) {
        SD s = new SD();
        s.display1();
        s.display2();
        s.display3();
    }
}
