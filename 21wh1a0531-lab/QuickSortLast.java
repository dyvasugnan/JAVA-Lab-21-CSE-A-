package javaclass;
import java.util.*;
public class QuickSortLast {
		public static void quicksort(int a[],int low,int high) {
			if(low<high) {
				int j = partition(a,low,high);
				quicksort(a,low,j-1);
				quicksort(a,j+1,high);
			}
		}
		public static int partition(int a[],int low,int high) {
			int pivot = a[high];
			int i = low;
			int j = high-1;
			while(i<=j) {
				while(i<=j && a[i]<=pivot) {
					i++;
				}
				while(i<=j && pivot<=a[j]) {
					j--;
				}
				if(i<j) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			int temp = a[high];
			a[high] = a[i];
			a[i] = temp;
			return i;
		}
		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			quicksort(a,0,n-1);
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");		
				}
			}

}
