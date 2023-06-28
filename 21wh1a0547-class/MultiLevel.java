package java_lab;
class One{
	int a=2;
	void show(){
	    System.out.println(a);
	}
}
class Two extends One{
	int b=3;
	void show1(){
	    super.show();
	    System.out.println(b);
	}
}
class Three extends Two{
	void show2() {
	    super.show1();
		System.out.println(a*b);
	}
}
public class Multilevel {
	public static void main(String args[]) {
		Three t = new Three();
		t.show2();
	}
}
