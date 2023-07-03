package clss;
class OverRide_super{
	void display() {
		System.out.println("Super Class Method");
	}
}
class OverRide_sub extends OverRide_super{
	void display() {
		System.out.println("Sub Class Method");
	}
}
public class OverRide {	
	public static void main(String[] args) {
		OverRide_sub a = new OverRide_sub();
		a.display();
		OverRide_super aa = new OverRide_super();
		aa.display();
	}

}
