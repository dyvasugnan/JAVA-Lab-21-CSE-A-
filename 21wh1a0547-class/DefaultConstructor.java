package java_lab;
import java.lang.*;
class Area{
	int len;
	int breadth;
	Area(){
		len = 10;
		breadth = 15;
	}
	void display() {
		int res = len*breadth;
		System.out.println(res);
	}
}
public class DefaultConstructor {
	public static void main(String args[]) {
		Area a = new Area();
		a.display();
	}

}
