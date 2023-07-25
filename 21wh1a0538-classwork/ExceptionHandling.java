package classprogram;

public class ExceptionHandling {
  public static void main(String args[]) {
	  int a = 5;
	  try {
		  System.out.print(5/0);
	  }
	  catch(ArithmeticException ref) {
			System.out.print(ref);
	  }
	  finally {
		  System.out.print("   closing");
	  }
  }
}

