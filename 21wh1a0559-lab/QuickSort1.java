import java.util.Scanner;

public class QuickSort1 {
	int partition(int a[], int low, int high) {
	    int pivot = a[high], i = low-1, j = low;
        while (j <= high-1) {
	        if (a[j] <= pivot) {
	            i++;
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	        j++;
	    }

	    int temp = a[i+1];
	    a[i+1] = a[high];
	    a[high] = temp;

	    return i+1;
	}



    void sort(int a[], int low, int high) {
        if (low < high) {
            int i = partition(a, low, high);
            sort(a, low, i-1);
            sort(a, i+1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements into array: ");
        for (int i=0; i<n; i++) 
            a[i] = sc.nextInt();
        QuickSort1 qs = new QuickSort1();
        qs.sort(a, 0, n-1);
        for (int i : a) 
            System.out.print(i + " ");
    }
}
