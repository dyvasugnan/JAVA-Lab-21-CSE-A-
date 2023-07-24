package cs;

public class ArithExc {
	public static void main(String[] args) {
		try{
			int a=10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	
}
