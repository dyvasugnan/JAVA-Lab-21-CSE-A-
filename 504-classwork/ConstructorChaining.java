package moulikaLab;

class Test{
	int a,b,c,d;
	Test(int p){
		a=p;
	}
	Test(int p, int q){
		this(p);
		b=q;
	}
	Test(int p, int q, int r){
		this(p,q);
		c=r;
	}
	Test(int p, int q, int r, int s){
		this(p,q,r);
		d=s;
	}
	void display() {
		System.out.println(a*b*c*d);
	}
}

public class ConstructorChaining {
	public static void main(String [] args) {
		Test t = new Test(1, 2, 3, 4);
		t.display();
	}
}
