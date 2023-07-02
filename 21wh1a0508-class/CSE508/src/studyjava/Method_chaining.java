package studyjava;

public class Method_chaining {
	int a,b;
	Method_chaining setData(int x, int y) {
		a = x;
		b= y;
		return this;
	}
	Method_chaining getData() {
		System.out.print(a);
		System.out.print(b);
		return this;
	}
}
	class Student5 {
		public static void main(String[] args) {
			Method_chaining s1 = new Method_chaining();
			s1.setData(28,66).getData().setData(98,55).getData();
	}
}
	
