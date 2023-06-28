package moulikaLab;
class One{
	void display() {
	System.out.println("SuperClass");
	}
}

class Two extends One{
	void display() {
		System.out.println("SubClass");
	super.display();
}
}

public class SingleIn {

	public static void main(String[] args) {
		Two t = new Two();
		t.display();
}
}
