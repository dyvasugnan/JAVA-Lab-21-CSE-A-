package labclass;
import java.util.*;
import java.io.*;
public class IsPrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==1) {
			System.out.print("It's a Prime");
		}
		else
			System.out.print("It's not a Prime");
	}
}
