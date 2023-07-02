package classprogram;
class First{
	int x;
	Second s;
	First(int x,Second s){
		this.x = x;
		this.s = s;
	}
	void display() {
		System.out.println("X : "+x);
		System.out.println("Y : "+s.y);
	}
}
class Second{
	int y;
	Second(int y ){
		this.y = y;
	}
}
public class ObjectReference {
public static void main(String args[]) {
	Second s = new Second(6);
	First f = new First(5,s);
	f.display();
}
}
