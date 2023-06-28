package javalab;
//x,y,w,u
class X{
	void show1() {
		System.out.println("This is class X");
	}
}

class Y extends X{
	void show2() {
		System.out.println("This is class Y");
	}
}

class W extends X{
	void show3() {
		System.out.println("This is class Z");
	}
}

class U extends Y{
	void show4() {
		System.out.println("This is class U");
	}
}

public class InhThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		U o = new U();
		o.show4();   //Hybrid Inheritance
		o.show2();
		o.show1();
		//o.show3();
//cant reference W
	}

}
