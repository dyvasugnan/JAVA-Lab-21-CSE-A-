/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Scholarship
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		if(rank>=1 && rank<=50){
		    System.out.println("100");
		}
		else if(rank>=51 && rank<=100){
		    System.out.println("50");
		}
		else{
		    System.out.println("0");
		}
	}
}
