package classprogram;

import java.util.Scanner;

public class QuicksortHigh {
	 void quickSort(int a[],int l,int h) {
			if(l<h) {
				 int i = partition(a,l,h);
				quickSort(a,l,i-1);
				quickSort(a,i+1,h);
			}}
			int partition(int a[],int l,int h) {
				int pivot = a[h];
				int i = l;
				int j = h-1;
				while(i<=j) 
		        {
		            while(i<=j && a[i]<=pivot) 
		            {
		                i++;
		            }
		            while(i<=j && a[j]>=pivot) 
		            {
		                j--;
		            }
		            if (i<j) 
		            {
		                int t = a[i];
		                a[i] = a[j];
		                a[j] = t;
		            }
		        }
		        int t = a[h];
		        a[h] = a[i];
		        a[i] = t;
				return i;
			}
			
			public static void main(String args[]) {
				  
				  Scanner sc = new Scanner(System.in);
				  System.out.print("Enter thr size : ");
				  int n = sc.nextInt();
				  int a[] = new int[n];
				  System.out.print("Enter the array elements : ");
				  for(int i = 0;i<n;i++)
					  a[i] = sc.nextInt();
				  QuickSort o = new QuickSort();
				  o.quickSort(a,0,n-1);
				  System.out.print("The sorted elements :\n");
				  for(int i = 0;i<n;i++)
					  System.out.print(a[i]);
			  }
			}

