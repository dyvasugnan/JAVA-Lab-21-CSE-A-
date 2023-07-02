package studyjava;

public class Constructor_chaining {
	int a,b,c,d;
	Constructor_chaining(int p,int q){
		a=p;
		b= q;
	}
	Constructor_chaining(int p,int q,int r){
		this(p,q);
		c=r;
	}
	Constructor_chaining(int p,int q,int r,int s){
		this(p,q,r);
		d = s;
	}
void display() {
	System.out.print(a+" "+b+" "+c+" "+d);
}
}
class Main5{
	public static void main(String args[]) {
		Constructor_chaining t = new Constructor_chaining(9,10,82,77);
	t.display();	
 }
}

