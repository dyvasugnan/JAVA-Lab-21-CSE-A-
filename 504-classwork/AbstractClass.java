package moulikaLab;

abstract class Shape{
	abstract void calculate(double x);
}

class Square extends Shape{
	void calculate(double x) {
		System.out.println(x*x);
	}
}

class Cube extends Shape{
	void calculate(double x) {
		System.out.println(x*x*x);
	}
}

class Sroot extends Shape{
	void calculate(double x) {
		System.out.println(Math.sqrt(x));
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Square sq = new Square();
		sq.calculate(4);
		Cube c = new Cube();
		c.calculate(3);
		Sroot sr = new Sroot();
		sr.calculate(9);

	}

}
