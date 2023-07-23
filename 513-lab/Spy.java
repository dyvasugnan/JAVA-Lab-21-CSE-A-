package javalab;
import java.util.*;
	class Spy{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,sum=0,prod=1;
		System.out.println("Enter the numbver; ");
		n = sc.nextInt();
		int temp=n;
		int x;
		while(n!=0){
			x=n%10;
			n=n/10;
			sum+=x;
			prod*=x;
		}
		if(sum==prod)
		System.out.println("true");
		
		else
		System.out.println("False");
		}
	}