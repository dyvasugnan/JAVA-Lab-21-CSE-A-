
//combination of hierarchial and single

package moulikaLab;

class Primary{
	void display() {
		System.out.println("Super class A");
	}
}
class Secondary extends Primary{
	void display() {
		super.display();
		System.out.println("Sub class 1 of A : B");
		
	}
}
class Tertiary extends Primary{
	void display() {
		System.out.println("Sub class 2 of A : C");
	}
}
class Quad extends Secondary{
	void display() {
		System.out.println("Sub class Of B : D");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondary s = new Secondary();
		s.display();
		Tertiary t = new Tertiary();
		t.display();
		Quad d = new Quad();
		d.display();

	}

}
