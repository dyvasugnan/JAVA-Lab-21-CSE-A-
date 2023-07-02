package studyjava;

public class ConstructorCopy {
	int length=20;
	int breadth = 8;
	ConstructorCopy(int len,int bre){
		length = len;
		breadth = bre;
		System.out.print(length*breadth+" ");
	}
	ConstructorCopy(ConstructorCopy a){
		length = a.length;
		breadth = a.breadth;
	}
}
class Area{
	public static void main(String args[]) {
		ConstructorCopy a1 = new ConstructorCopy(5000,325);
		ConstructorCopy c1 = new ConstructorCopy(a1);
	}
}
