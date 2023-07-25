package javaclass;
import java.util.*;
public class ArraySum {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,sum = 0,i; 
		int a[] = new int[50];
		System.out.print("Enter the size of array");
		n = sc.nextInt();
		System.out.print("Enter array elements");
		for(i = 0;i<n;i++)
		{
		a[i] = sc.nextInt();
		sum = sum + a[i];
		}
		System.out.print("THe sum is "+sum);
		}
	}
