package javalab;
class Z{
	void show1() {
		System.out.println("THis is class One");
	}
}

class two extends Z{
	void show2() {
		System.out.println("This is class Two");
	}
}

class three extends Z{
	void show3() {
		System.out.println("This is class three");
	}
}

public class InhTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three t = new three(); // Hierarchical Inheritance
		t.show1();
		//t.show2(); will show error cus three cant access two
		t.show3();

	}

}
