package labclass;
import java.util.*;
import java.io.*;
public class IsArmStrongNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int t=n,s=0,rm;
		while(n>0) {
			rm=n%10;
			s+=rm*rm*rm;
			n=n/10;
		}
		if(s==t)
			System.out.print("True");
		else
			System.out.print("False");
	}
}
