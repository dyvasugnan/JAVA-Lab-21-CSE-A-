package java_codes;


	class Calculate {
		int sum(int x,int y) {
			return (x+y);
		}
		int sum(int x,int y,int z) {
			return (x+y+z);
		}
		double sum(double x,double y) {
			return(x+y);
		}

}
public class OverLoading {
	public static void main(String args[]) {
		Calculate c= new Calculate();
		System.out.println(c.sum(2, 3));
		System.out.println(c.sum(2, 3, 5));
		System.out.println(c.sum(2.5, 3.6));
	}
}
