package lab;

import java.util.Scanner;

public class MergeSort {
	
	
		static void merge(int a[],int l,int h,int k) {
			
			int i= l;
			int j= k+1;
			
			int temp[] =  new int[h-l+1];
			
				int s=0;
				
			while(i<=k && j<=h) {
				if(a[i]<=a[j]) {
					temp[s] = a[i];
					i++;
					s++;
				}else {
					temp[s] = a[j];
					j++;
					s++;
				}
			}
			
			
			while(i<=k) {
				temp[s] = a[i];
				i++;
				s++;
			}
			
			while(j<=h) {
				temp[s] = a[j];
				j++;
				s++;
			}
			
			int y=0;
			for(int x=l;x<=h;x++) {
				a[x] = temp[y];
				y++;
			}
			
		}
		
		static void sort(int a[],int low,int high) {
			
			if(low<high) {
				int mid = (low+high)/2;
				
				sort(a,low,mid);
				sort(a, mid+1,high);
				
				merge(a,low,high,mid);
			}
		}
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			sort(a,0,n-1);
			
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
			
			
		}
}
