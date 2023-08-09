import java.util.*;
import java.io.*;
import java.lang.*;

class IsGapful
{
    static int firstDigit(int n)
    {
    	int digits = (int)(Math.log(n)/Math.log(10));
    	n = (int)(n / Math.pow(10, digits));
    	return n;
    }
    static int lastDigit(int n)
    {
        	return (n % 10);
    }
    static boolean isGapful(int n)
    {
    	int first_dig = firstDigit(n);
    	int last_dig = lastDigit(n);
    
    	int concatenation = first_dig * 10 +
    						last_dig;
    	return (n % concatenation == 0);
    }
    public static void main(String[] args)
    {
    	System.out.print("Enter a number: ");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	if (isGapful(n))
    		System.out.print("Yes");
    	else
    		System.out.print("No");
    }
}

