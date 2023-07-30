package java_codes;


	class Add {
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
public class Sum{
	public static void main(String args[]) {
		Add c= new Add();
		System.out.println(c.sum(2, 3));
		System.out.println(c.sum(2, 3, 5));
		System.out.println(c.sum(2.5, 3.6));
	}
}

