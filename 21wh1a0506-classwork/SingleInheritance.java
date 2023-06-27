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

public class SingleInheritance{
	public static void main(String[] args) {
		B b = new B();
		b.show1();
		b.show();
	}
}
