package cs;

class Outs{
	int x = 10;
	Outs(){
		System.out.println("Constructor of outer");
	}
	class Inn{
		void show(){
			System.out.println("INNer class");
		}
	}
}

public class innercls {
	public static void main(String[] args) {
		
	
	Outs.Inn obj1 = new Outs().new Inn();
	obj1.show();

	Outs obj2 = new Outs();
	System.out.print(obj2.x);
}
}
