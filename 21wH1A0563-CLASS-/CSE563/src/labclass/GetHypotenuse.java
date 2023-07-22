package labclass;
import java.util.*;
import java.io.*;
import java.math.*;
public class GetHypotenuse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=Math.sqrt(a*a + b*b);
		System.out.print(c);
	}

}
