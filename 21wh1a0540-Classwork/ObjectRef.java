package javaclass;
public class ObjectRef {
public static void main(String args[]) {
	Second s = new Second(20);
	FirstOne fo = new FirstOne(10,s);
	fo.display();
}
}


class FirstOne{
	int a;
	Second s;
	FirstOne(int a,Second s){
		this.a = a;
		this.s = s;
	}
	void display() {
		System.out.println("A : "+a);
		System.out.println("B : "+s.b);
	}
}
class Second{
	int b;
	Second(int b){
		this.b = b;
	}
}

