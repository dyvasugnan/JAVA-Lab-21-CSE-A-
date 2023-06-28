package javalab;
class Sire{
	public void display1() {
		System.out.println("Eating.....");
	}
}
class Cat extends Sire{
	public void display1() {
		super.display1();
	}
	public void display2() {
		System.out.println("Meow....");
		}
}
class Babycat extends Cat{
	public void display1() {
		super.display1();
	}
	public void display3() {
		System.out.println("crying....");
		
	}
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babycat bc = new Babycat();
		bc.display1();		
		bc.display2();
		bc.display3();

	}

}
