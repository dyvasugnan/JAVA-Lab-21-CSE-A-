package practice.java;
import java.lang.*;
import java.util.*;

public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}
		static int factorial(int n)
		 {
		  if (n == 0)
		  return 1;
		   
		  return n*factorial(n-1);
		 }
		  
		 public static void main(String[] args)
		 {
		  int num = 5;
		  System.out.println("Factorial of "+ num + " is " + factorial(5));
		 }
	}
