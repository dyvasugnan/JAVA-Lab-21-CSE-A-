/*java program to find sum and reverse of digits of a given number */

package javalab;

import java.lang.*;
import java.util.*;

public class Sum_ReverseNum {
	public static void main(String args[]) {
		int num,rem,rev=0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		
		num=sc.nextInt();
		while(num != 0) {
			rem = num % 10;
			sum = sum + rem;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("sum of digits of number:"+sum);
		System.out.println("reverse of given number:"+rev);
		
	}

	
}
