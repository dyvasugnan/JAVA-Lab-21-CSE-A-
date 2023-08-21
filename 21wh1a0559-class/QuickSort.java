import java.util.Scanner;
public class QuickSort {
	int partition(int a[], int low, int high) {
	    int pivot = a[low], i = low+1, j=high;
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
	    a[low] = temp;
	    return j;
	}

	void sort(int a[], int l, int h){
		if(l<h) {
			int j = partition(a,l,h);
			sort(a,l,j-1);
			sort(a,j+1,h);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array: ");
		for(int i =0; i<n; i++)
		    a[i] = sc.nextInt();
		QuickSort qs = new QuickSort();
		qs.sort(a, 0, n-1);
		for(int i : a)
		    System.out.print(i+" ");
		
		
	}
}
