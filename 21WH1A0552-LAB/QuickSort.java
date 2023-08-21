
import java.util.Scanner;

public class QuickSort {
	int partition(int a[], int l, int h) {
	    int pivot = a[l];
	    int i = l + 1;
	    int j = h;
	    while (i <= j) {
	        while (i <= j && a[i] <= pivot) i++;
	        while (i <= j && a[j] > pivot) j--;
	        if (i < j) {
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	    }
	    int temp = a[j];
	    a[j] = pivot;
	    a[l] = temp;
	    return j;
	}
	void quicksort(int a[], int l, int h){
		if(l<h) {
			int p = partition(a,l,h);
			quicksort(a,l,p-1);
			quicksort(a,p+1,h);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter array elements : ");
		for(int i =0; i<n; i++) a[i] = sc.nextInt();
		QuickSort q = new QuickSort();
		q.quicksort(a, 0, n-1);
		System.out.print("After Sorting : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	}
}
