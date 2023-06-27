//Single (A <- B) + Hierarchical (B <- C & D) 
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

class C extends B{
    void show2(){
        System.out.println("Class C");
    }
}

class D extends B{
    void show3(){
        System.out.println("Class D");
    }
}

public class Hybrid{
	public static void main(String[] args) {
		C c = new C();
		c.show2();
		c.show1();
		c.show();
		D d = new D();
		d.show3();
		d.show1();
		d.show();
		B b = new B();
		b.show1();
		b.show();
	}
}
