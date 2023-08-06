 
package java_lab;
import java.util.*;
public class Fibonnaci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		for(int i=1;i<n;i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
		
	}

}
