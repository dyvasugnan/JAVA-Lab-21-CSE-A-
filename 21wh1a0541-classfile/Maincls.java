package javaprograms;

abstract class Mathcls{
abstract void calculate(double x);
}

class SquareNum extends Mathcls{
	void calculate(double x) {
		System.out.println(x*x);
	}
}

class Cube extends Mathcls{
	void calculate(double x) {
		System.out.println(x*x*x);
	}
}

class Squareroot extends Mathcls{
	void calculate(double x) {
		System.out.println(Math.sqrt(x));
	}
}

public class Maincls{
	public static void main(String [] args) {
		SquareNum s = new SquareNum();
		s.calculate(2.5);
		Cube c = new Cube();
		c.calculate(2.0);
		Squareroot sr = new Squareroot();
		sr.calculate(4.0);
		
	}

}
