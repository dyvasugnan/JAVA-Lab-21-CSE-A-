package javalab;

import java.util.Scanner;

public class QuickSort {
	static int partition(int[] a,int low, int high) {
		int pivot=a[low];
		int i=low+1;
		int j=high;
		while(i<=j) {
		while(i<=j && a[i]<=pivot) {
			i++;
		}
		while(i<=j && a[j]>pivot) {
			j--;
		}
		if(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		int temp=a[low];
		a[low]=a[j];
		a[j]=temp;
		return j;
	}
	static void quicksort(int[] a,int low, int high) {
		if(low<high) {
			int j=partition(a,low,high);
			quicksort(a,low,j-1);
			quicksort(a,j+1,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		QuickSort q=new QuickSort();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		quicksort(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
