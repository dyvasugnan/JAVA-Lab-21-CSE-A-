package labclass;
import java.util.*;
import java.io.*;
public class FactorialNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		System.out.print(f);
	}
}
