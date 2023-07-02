package studyjava;
import java.lang.*;

import java.util.Scanner;


public class Bubblesort {
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,temp;
		System.out.print("Enter elements to be sorted");
		n= sc.nextInt();

		int array[] = new int[10];
		System.out.print("Enter "+ n +" Integers");
		for(i=0;i<n;i++)
			array[i] = sc.nextInt();
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(array[j]> array[j+1]) {
					temp  = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted elements");
		for(i=0;i<n;i++)
			System.out.print(array[i]);
		
	}

}
