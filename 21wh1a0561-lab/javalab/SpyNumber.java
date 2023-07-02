package javalab;
import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num,p=1,s=0;
		System.out.print("enter number");
		num = sc.nextInt();
		int r;
		while(num>0){
		   r=num%10;
		   s=s+r;
		   p=p*r;
		   num=num/10;
	   }
	   if(s==p){
	     System.out.print("spy number");
	   }
	   else{
	    System.out.print("not a spy number");
	   }
	}
}	




