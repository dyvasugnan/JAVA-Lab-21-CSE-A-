package cs;

class A{
	int x=10;
	public void print(){
		System.out.println("Super class");
	}
}

class B extends A{
	int y= 20;
	public void print(){
		System.out.println("Sub class");
	}
}

public class Generalization {
	public static void main(String[] args) {
	//genralization
	A a = new B();
  a.print(); 
	System.out.println(a.x);
	}

}
