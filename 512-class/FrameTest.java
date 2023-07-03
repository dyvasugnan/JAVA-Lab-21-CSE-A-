package clss;
import java.math.BigInteger;
public class FrameTest {
	static BigInteger factorial(int N) {
		BigInteger f = new BigInteger ("1");
		for(int i=2;i<=N;i++)
			f=f.multiply(BigInteger valueof(i));
		return f;
	}
	public static void main(String args[]) throws execption{
		int N=20;
		System.out.println("fact of"+N+"is"+factorial(N));
	}
}
