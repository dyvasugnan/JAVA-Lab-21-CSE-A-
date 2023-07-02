package studyjava;

public class This_keyword {
	int a=5;
	int b= 78;
	This_keyword (int a,int b){
		this.a = a;
		this.b = b;
		System.out.print(a*b);
	}
}
  class Main3
	{
		public static void main(String[] args) {
			This_keyword t = new This_keyword (68,98);
	}
}

