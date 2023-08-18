package java_lab;
import java.lang.*;
class Sample{
	int x,y;
	Sample(int a,int b){
		x = a;
		y = b;
	}
	void swap(Sample s) {
		int temp;
		temp = s.x;
		s.x = s.y;
		s.y  = temp;
	}
}
public class CallByReference {
	public static void main(String args[]) {
		Sample s = new Sample(1,2);
		//System.out.println("n1:"+s1.n1 "n2:"+s1.n2);
		s.swap(s);
		System.out.println("a:"+s.x+"b:"+s.y);
	}

}
