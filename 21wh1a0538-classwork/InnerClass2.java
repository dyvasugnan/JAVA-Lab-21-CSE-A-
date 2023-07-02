package classprogram;
class Outer{
	void display() {
		class Inner{
			void show() {
				System.out.print("Inner class");
			}
		}
		Inner s = new Inner ();
		s.show();
	}
}
public class InnerClass2 {
public static void main(String args[]) {
	Outer o = new Outer ();
	o.display();
}
}
