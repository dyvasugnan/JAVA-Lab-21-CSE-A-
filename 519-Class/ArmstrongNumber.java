package java_codes;

import java.util.*;
import java.lang.*;
public class ArmstrongNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int rem=0;
		int res=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			res+=Math.pow(rem,3);
			num=num/10;
			}
		if(res==temp) {
			System.out.print(temp+" "+"is a armstrong number");
		}
		else {
			System.out.print(temp+" "+"is not a armstrong number");
		}
	}

}