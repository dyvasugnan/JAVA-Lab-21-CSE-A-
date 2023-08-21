
import java.util.Scanner;

public class QuickSortLast {
	int partition(int a[], int l, int h) {
	    int pivot = a[h];
	    int i = l - 1;
	    int j = l;

	    while (j <= h - 1) {
	        if (a[j] <= pivot) {
	            i++;
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	        j++;
	    }

	    int temp = a[i + 1];
	    a[i + 1] = a[h];
	    a[h] = temp;

	    return i + 1;
	}



    void quicksort(int a[], int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quicksort(a, l, p-1);
            quicksort(a, p+1, h);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        QuickSortLast q = new QuickSortLast();
        q.quicksort(a, 0, n - 1);
        System.out.print("After Sorting : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
    }
}
