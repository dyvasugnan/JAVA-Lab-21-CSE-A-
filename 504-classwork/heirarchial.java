package moulikaLab;

class First{
	int i=10;
	void display() {
		System.out.println("SuperClass:"+i);
	}
}
class Second extends First{
	int j= 20;
	void display(){
		System.out.println("SubClass 1: "+j);
		super.display();
	}
}
class Third extends First{
	int k=20;
	void display() {
		System.out.println("SubClass 2: "+k);
		super.display();
	}
}
public class heirarchial {

	public static void main(String[] args) {
		Third t = new Third();
		Second s = new Second();
		s.display();
		System.out.println("\n");
		t.display();
	}

}
