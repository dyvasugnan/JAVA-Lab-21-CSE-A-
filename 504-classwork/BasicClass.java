package moulikaLab;

class Eight{
	int marks;
	String name;
	void display() {
		System.out.println(marks);
		System.out.println(name);
	}
}

public class BasicClass {
	public static void main(String [] args) {
		Eight o = new Eight();
		o.display();
	}
}
