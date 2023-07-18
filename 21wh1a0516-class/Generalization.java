package cs;

class Parent{
	int i=10;
	public void display(){
		System.out.println("Parent class");
	}
}

class child extends Parent{
	int j= 20;
	public void display(){
		System.out.println("Child class");
	}
}

public class Generalization {
	public static void main(String[] args) {
		
	
	//genralization - upcasting 
	Parent p = new child();
	// p can access only parent properties not child prop
	//except overidden funcns in child

	p.display(); // child classs
	System.out.println(p.i);
	// error - System.out.println(p.j); 
	}

}
