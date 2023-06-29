package clss;

class Parent {public void display() {
    System.out.println("This is the parent class.");
}
}
class Child extends Parent {
    public void show() {
        System.out.println("This is the child class.");
    }
}

public class SingleInheritence {

	public static void main(String[] args) {
		Child child = new Child();
        child.display(); 
        child.show();    
		
	}

}
