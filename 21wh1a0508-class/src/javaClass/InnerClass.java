package javaClass;
class Outer{
	void display() {
		class InnerTest{
			void show() {
				System.out.print("InnerClass");
			}
		}
		InnerTest in = new InnerTest();
		in.show();
	}
}
public class InnerClass{
	public static void main(String args[]) {
		Outer obj = new Outer();
	   obj.display();
		}
}