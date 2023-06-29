package clss;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
class Labrador extends Dog {
    public void color() {
        System.out.println("Labrador is brown");
    }
}

public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Labrador labrador = new Labrador();
	        labrador.eat();   
	        labrador.bark();  
	        labrador.color();

	}

}
