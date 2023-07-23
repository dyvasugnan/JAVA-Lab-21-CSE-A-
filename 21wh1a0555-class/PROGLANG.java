/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProLang
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		int A,B,A1,B1,A2,B2;
		
		for(int i=0;i<test_cases;i++){
		A = sc.nextInt();
		B = sc.nextInt();
		A1 = sc.nextInt();
		B1= sc.nextInt();
		A2 = sc.nextInt();
		B2 = sc.nextInt();
		if((A==A1||A==B1)&&(B==B1||B==A1)){
		    System.out.println("1");
		}
		else if((A==A2||A==B2)&&(B==B2||B==A2)){
		    System.out.println("2");
		}
		else{
		    System.out.println("0");
		}
		}
	}
}
