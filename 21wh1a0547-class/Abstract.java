package java_lab;
import java.lang.*;
abstract class Shape{
	abstract void calc(double x);
}
class Square extends Shape{
	void calc(double x){
		System.out.println(x*x);
	}
}
class Cube extends Shape{
	void calc(double x) {
		System.out.println(x*x*x);
	}
}
class Sqrt extends Shape{
	void calc(double x) {
		System.out.println(Math.sqrt(x));
	}
}
public class Abstract {
	public static void main(String args[]) {
		Square s = new Square();
		s.calc(2.5);
		Cube c = new Cube();
		c.calc(3.4);
		Sqrt sq = new Sqrt();
		sq.calc(4.3);
	}

}
