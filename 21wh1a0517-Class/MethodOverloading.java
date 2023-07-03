package javalab;

class Add{
	public int add(int x,int y) {
		return (x+y);
	}
	public int add(int x,int y,int z) {
	return(x+y+z);
	}
	public double add(double x,double y) {
		return(x+y);
	}
}
public class MethodOverloading {
	public static void main(String args[]) {
		Add a = new Add();
		System.out.println(a.add(5, 4));
		System.out.println(a.add(2, 3, 5));
		System.out.println(a.add(2.3, 5.2));
		
	}
}
