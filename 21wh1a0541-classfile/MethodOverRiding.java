package javaprograms;
class OverRide_Super{
	void display() {
		System.out.println("Super class Method");
	}
}
class OverRide_Sub1 extends OverRide_Super{
	void display() {
		System.out.println("Sub1 class Method");
	}
}
class OverRide_Sub2 extends OverRide_Sub1{
	void display() {
		System.out.println("Sub2 class Method");
	}
}
public class MethodOverRiding {
public static void main(String[] args) {
	OverRide_Super aaa = new OverRide_Super();
	OverRide_Sub1 aa = new OverRide_Sub1();
	OverRide_Sub2 a = new OverRide_Sub2();
	OverRide_Super r;
	r = aaa;
	r.display();
	r = aa;
	r.display();
	r = a;
	r.display();
}
}
