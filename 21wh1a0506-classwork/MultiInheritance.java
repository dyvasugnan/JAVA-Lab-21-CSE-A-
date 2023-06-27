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

public class MultiInheritance{
	public static void main(String[] args) {
		C c = new C();
		c.show2();
		c.show1();
		c.show();
	}
}
