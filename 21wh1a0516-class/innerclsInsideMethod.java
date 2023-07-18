package cs;

class Outer{
	int i = 10;
	void display(){
		class Inner{
			void show(){
				System.out.println("INNer cls");
			}
		}
		Inner in = new Inner();
		in.show();
	}
}

public class innerclsInsideMethod {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.display();
	}
}
