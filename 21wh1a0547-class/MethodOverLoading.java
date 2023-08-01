package java_lab;
import java.lang.*;
class Add{
	public int  add(int x,int y) {
		return(x+y);
	}
	public int add(int x,int y,int z) {
		return(x+y+z);
	}
	public int add(int x,int y,int z ,int s) {
		return(x+y+z+s);
	}
}
public class MethodOverLoading {
	public static void main(String args[]) {
		Add a = new Add();
		System.out.println(a.add(12,13));
		System.out.println(a.add(12,13,14));
		System.out.println(a.add(12,13,11,14));


	}

}
