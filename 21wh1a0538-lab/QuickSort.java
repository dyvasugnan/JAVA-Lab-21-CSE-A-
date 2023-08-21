package classprogram;
import java.util.*;
public class QuickSort {
	 void quickSort(int a[],int l,int h) {
		if(l<h) {
			 int j = partition(a,l,h);
			quickSort(a,l,j-1);
			quickSort(a,j+1,h);
		}
	}
	int partition(int a[],int l,int h) {
		int pivot = a[l];
		int i = l+1;
		int j = h;
		while(l<j) {
		while( a[i]<=pivot&&i<h)
			i++;
		while(a[j]>pivot&&j>l)
			j--;
		if(i<j)
		{
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			}
		else {
		int t = pivot;
		pivot = a[j];
		a[j] = t;}}
		
		return j;
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
