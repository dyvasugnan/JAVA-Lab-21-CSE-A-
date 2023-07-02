package classprogram;
class Test{
	int a,b,c,d;
	Test(int A,int B){
		a = A;
		b = B;
	}
	Test (int A,int B,int C){
		this(A,B);
		c = C;
	}
	Test(int A,int B,int C,int D){
		this(A,B,C);
		d = D;
	}
	void display() {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
public class ConstructorChaining {
public static void main(String args[]) {
	Test t = new Test(1,2,3,4);
	t.display();
}
}
