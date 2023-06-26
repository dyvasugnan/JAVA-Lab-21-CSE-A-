package cs;

class Demo{
	int n1;
	int n2;
	Demo(int x,int y){
		n1 = x;
		n2 = y;
	}
	void swap(){
		int t =n1;
		n1 = n2;
		n2 = t;
	}
	void display(){
		System.out.println(n1+" "+n2);
	}
}

public class Swap {
	public static void main(String[] args) {
		int n1 = 10,n2 = 20;
		System.out.println("n1 "+n1+" "+"n2 "+n2);
		Demo d = new Demo(n1,n2);
		d.swap();
		d.display();
	}
}
