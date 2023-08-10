package java_lab;
import java.util.*;
public class PrimeOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		if(n==0 || n==1) {
			c=1;
		}
		else {
			for(int i = 2;i<=Math.sqrt(n);i++) {
				if(n%i == 0) {
					c++;
					break;
				}
			}
		}
		if(c==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
	}

}
