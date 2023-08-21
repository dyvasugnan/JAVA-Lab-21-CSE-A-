
import java.util.*;


public class QuickSortPivotLow {
	
	void sort(int a[], int low , int high) {
		if(low < high) {
			int j = partition(a,low,high);
			sort(a,low,j-1);
			sort(a,j+1,high);
		}
	}
	
	int partition(int a[], int low, int high) {
	    
		int pivot = a[low];
		
	    int i = low + 1,j = high;
	        
	    while (i <= j) {
	        while (i<=j && a[i] <= pivot) {
	            i++;
	        }	        
	        while ( i<= j && a[j] > pivot) {
	            j--;
	        }
	       		
	        if (i < j) {	           
	           int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	      
	    }
	    int temp = a[j];
	    a[j] = pivot;
    	a[low] = temp;
	    
	    return j;
	}

	
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		int a[]= new int[n];
		System.out.print("Enter numbers into array :  ");
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		QuickSortPivotLow q = new QuickSortPivotLow();
		q.sort(a, 0, n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	
}
