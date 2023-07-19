package javalab;

import java.util.Scanner;


public class Bub {
	 public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int n,i,j,temp;
		System.out.println("Enter no. of elements: ");
		n= sc.nextInt();

		int a[] = new int[n];
		
		System.out.println("Enter "+ n +" Integers: ");
		for(i=0;i<n;i++)
			a[i] = sc.nextInt();
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j]> a[j+1]) {
					temp  = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		for(int k:a)
			System.out.print(k+" ");
		
		sc.close();
		
	}
	 
}
