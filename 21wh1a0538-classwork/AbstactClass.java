package classprogram;
abstract class cal{
	int u;
	abstract void calculate(int bill) ;
}
class Home extends cal{
	void calculate(int bill) {
		System.out.println(5000*bill);
	}
}
class Office extends cal{
	void calculate(int bill) {
		System.out.println(10000*bill);
	}
}
public class AbstactClass  {
public static void main(String args[]) {
	Office o = new Office();
	o.calculate(89);
}
}
