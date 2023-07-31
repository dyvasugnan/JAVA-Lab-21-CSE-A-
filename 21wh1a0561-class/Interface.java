package javalab;
interface Ones{
	final int x = 10;
	void add(int y);
}
class two implements Ones{
	public void add(int y){
		System.out.println(x+y);
	}
}

public class Interface {
	public static void main(String[] args) {
		two t = new two();
		t.add(10);
	}
}