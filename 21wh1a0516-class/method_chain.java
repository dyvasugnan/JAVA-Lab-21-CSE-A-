package cs;


class Stud{
	int a,b,c,d;
	Stud(){}
	Stud(int p, int q){
		a = p;
		b = q;
	}

	Stud(int p,int q,int r){
		this(p,q);
		c = r;
	}

	Stud(int p,int q,int r,int s){
		this(p,q,r);
		d = s;
	}


	Stud setdata(int x,int y){
		a = x;
		b = y;
		return this;
	}

	void getdata(){
		System.out.println(a+" "+b);
	}
}
public class method_chain {
	public static void main(String[] args) {
		Stud s1 = new Stud();
		s1.setdata(20,10).getdata();
		Stud s2 = new Stud(1,2,3,4);
		s2.getdata();
	}
}
