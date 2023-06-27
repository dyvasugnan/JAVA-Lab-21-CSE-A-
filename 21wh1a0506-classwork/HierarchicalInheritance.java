import java.lang.*;

class A{
    void show(){
        System.out.println("Class A");
    }
}

class B extends A{
    void show1(){
        System.out.println("Class B");
    }
}

class C extends A{
    void show2(){
        System.out.println("Class C");
    }
}

public class HierarchicalInheritance{
	public static void main(String[] args) {
		C c = new C();
		c.show2();
		c.show();
		B b = new B();
		b.show1();
		b.show();
	}
}
