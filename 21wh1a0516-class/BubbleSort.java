import java.util.*;
import java.lang.*;

import java.io.*;


public class Bubblesort {

	
		
	public static void main(String[] args) {
		System.out.println("Enter the size");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];

		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		int i = n,temp;
		while(i>0){
			for(int j=0;j<i-1;j++){
				if(x[j] > x[j+1]){
					temp = x[j+1];
					x[j+1] = x[j];
					x[j] = temp;
					
				}
			}
			i--;
		}

		for(int itr : x){
			System.out.print(itr+" ");
		}
}
}
