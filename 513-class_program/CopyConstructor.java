package javalab;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy c = new Copy("abc",24);
		Copy t = new Copy(c);
		c.display();
		t.display();
		
	}

}
class Copy{
	String name;
	int age;
	Copy(String name, int age){
		this.name = name;
		this.age = age;
	}
	Copy(Copy c){
		name = c.name;
		age = c.age;
	}
	void display() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
	}
}