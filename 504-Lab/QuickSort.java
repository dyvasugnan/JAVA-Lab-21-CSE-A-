package moulikaLab;

import java.util.*;

public class QuickSort {

	      public static void Sort(int a[],int low,int high) {

	    	  if(low<high) {

	    		  int j = partition(a,low,high);

	    		  Sort(a,low,j-1);

	    		  Sort(a,j+1,high);

	    	  }

	      }

	      public static int partition(int a[],int low,int high) {

	    	  int pivot = a[low];

	    	  int i = low +1;

	    	  int j = high;

	    	  int temp;

	    	  while(i<=j) {

	    	  while(a[i]<=pivot && i<=j)

	    		  i++;

	    	  while(a[j]>pivot && i<=j)

	    		  j--;

	    	  if(i<j)

	    	  {

	    		  temp = a[i];

	    		  a[i] = a[j];

	    		  a[j] = temp;

	    	  }}

	    		  

	    	     a[low] = a[j];

	    	     a[j] = pivot;

	    	  

	    	  return j;

	      }

          public static void main(String args[]) {

        	  Scanner sc = new Scanner(System.in);

        	  System.out.print("Enter size : ");

        	  int n = sc.nextInt();

        	  int[] a = new int[n];

        	  System.out.println("Before Sorting: ");
       	  
        	  for(int i=0;i<n;i++)

        		  a[i] = sc.nextInt();

        	  Sort(a,0,n-1);
        	  
        	  System.out.println("After Sorting: ");

        	  for(int k=0;k<n;k++)

        		  System.out.print(a[k]+" ");

          }

}