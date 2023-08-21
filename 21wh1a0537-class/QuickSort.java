package javalab;
import java.util.*;
import java.lang.*;

public class QuickSort{
	static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	static int partition(int a[],int low,int high) {
		
		int i=low;
		int j=high-1;
		int p=a[high];
		if(i<j) {
		while(a[i]<=p)i++;
		while(a[j]>p)j--;
		if(i<j) swap(a,i,j);
		}
		swap(a,high -1,j);
		
		return j;
	
	}
	
	static void sort(int a[],int low,int high) {
		if(low<high) {
		int j=partition(a,low, high);

		sort(a,low,j-1);
		sort(a,j+1,high);
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	
		System.out.print("enter no of elements : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements into array :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();

		}
		
		sort(a,0,n-1);
		System.out.println("after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}


}
}
