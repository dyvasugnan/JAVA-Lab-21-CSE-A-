package javaclasswork;
import java.util.Scanner;  
public class Perfectsquare {
	public static void main(String[] args)   
	{   
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a number: ");   
	double n=sc.nextDouble();   
	if (Perfectsquare(n))   
	System.out.println("Yes, the given number is perfect square.");  
	else  
	System.out.print("No, the given number is not perfect square.");   
	}  
	static boolean Perfectsquare(double n)   
	{   
	for (int i=1; i*i<=n; i++)   
	{    
	if((n%i==0) && (n/i==i))   
	{   
	return true;   
	}   
	}
	return false;
	}
}