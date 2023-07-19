/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class SpyNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0;
	    int product = 1;
	    int temp = n;
	    int temp2 = n;
	    while(temp > 0){
	        int rem = temp % 10;
	        sum = sum + rem;
	        temp = temp / 10;
	    }
	    while(temp2 > 0){
	        int remainder = temp2 % 10;
	        product = product * remainder;
	        temp2 = temp2 / 10;
	    }
	    if(n < 0){
	        System.out.println(-1);
	    }
	    else if(sum == product){
	        System.out.println("Spy Number");
	    }
	    else{
	        System.out.println("Not Spy Number");
	    }
	
	}
}
