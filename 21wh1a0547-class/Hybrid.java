package java_lab;
class Apple{
	void display() {
		System.out.println("Apple");
	}
}
class Banana extends Apple{
	void display() {
		System.out.println("Banana");
	}
}
class Mango extends Apple{
	void display() {
		System.out.println("Mango");
	}
}
class PineApple extends Banana{
	void display() {
		System.out.println("PineApple");
	}
}
public class Hybrid {
	public static void main(String args[]) {
		PineApple p = new PineApple();
		p.display();

	}

}
