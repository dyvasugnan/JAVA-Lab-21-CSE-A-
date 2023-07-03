package javaprograms;
class Add{
	public int add(int x, int y) {
		return(x+y);
	}
	public int add(int x,int y,int z) {
		return(x+y+z);
	}
	public double add(double x,double y) {
		return(x+y);
	}
}
public class MethodOverLoading {
	public static void main(String [] args) {
	Add a = new Add();
	System.out.println(a.add(12,13));
	System.out.println(a.add(12,13,14));
	System.out.println(a.add(12.2,13.4));
}
}
