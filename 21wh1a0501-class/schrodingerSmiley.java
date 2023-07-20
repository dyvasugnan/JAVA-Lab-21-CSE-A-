/* package codechef; // don't place package name! */



import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class SchrodingerSmiley

{

	public static void main (String[] args) throws java.lang.Exception

	{

		// your code goes here

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t>0){

		    int n = sc.nextInt();

		    String s= sc.next();

		    int count = 0;

		    String alpha = "";

		    int i=0;

		    if(s.charAt(0)==':'){

		        alpha = ":";

		        i=1;

		    }

		    for(; i<s.length(); i++){

		        if(s.charAt(i)==':'){

		            if(!alpha.contains("(") && alpha.contains(":") && alpha.contains(")")){

		                count++;

		            }

		            alpha = ":";

		        }

		        else{

		            alpha+=s.charAt(i);

		        }

		    }

		    System.out.println(count);

		    t--;

		}

	}

}

