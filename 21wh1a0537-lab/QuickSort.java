package javalab;

import java.util.*;
	
public class QuickSort {
		
	
		static int pivot(int arr[],int low,int high) {
			int i= low, j = high-1;
			int p = arr[high];
			while(i<j) {
			while (arr[i]<=p ) {
				i++;
			}
			while( arr[j]>p) j--;
			if(i<j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				}
			}
			int t = arr[i];
			arr[i] = p;
			
			arr[high] = t;
			return i;
		}
			
			
		
		static void sort(int arr[],int low,int high) {
			if(low<high) {
				int pi = pivot( arr, low,high);
				sort(arr,low,pi-1);
				sort(arr,pi+1,high);
			}
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			sort(arr,0,n-1);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
}
