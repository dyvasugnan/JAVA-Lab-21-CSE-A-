/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Atm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int test_cases,N,K;
		Scanner sc = new Scanner(System.in);
		test_cases = sc.nextInt();
		for(int i=0;i<test_cases;i++){
		    N = sc.nextInt();
		    K = sc.nextInt();
		    String s = "";
		    int p[] = new int[N];
		    for(int j=0;j<N;j++){
		        p[j]=sc.nextInt();
		    }
		    for(int l=0;l<N;l++){
		        if(p[l]<=K){
		            K=K-p[l];
		            s = s+"1";
		        }
		        else{
		            s=s+"0";
		        }
		    }
		    System.out.println(s);
		}
		
	}
}
