package javalab;
import java.lang.*;
import java.util.*;

public class SampleProgram {

	public static void main(String[] args) {
		int i,count = 0,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		n=sc.nextInt();
		for( i=1;i<=n;i++) {
			if(n%i==0) {
				count ++;
			}
				
		}
		if(count == 2) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
			
		}
		// TODO Auto-generated method stub

	}

}
