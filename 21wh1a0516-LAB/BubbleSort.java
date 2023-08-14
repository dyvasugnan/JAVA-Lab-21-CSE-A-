package lab;

import java.util.*;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int swaps=0;
		
		int i=n;
		while(i>0) {
			for(int j=0;j<i-1;j++) {
				if(a[j]<a[j+1]) {
					int t=a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					swaps++;
					
					System.out.println("Swapped "+j+" and"+(j+1));
				}
			}
			i--;
		}
		
		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
			
		}
		
		System.out.println("\n"+swaps);
	}
}
