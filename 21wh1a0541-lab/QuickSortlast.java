import java.util.Scanner;
public class QuickSort {
    public static void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quicksort(a, low, j - 1);
            quicksort(a, j + 1, high);
        }
    }
    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low;
        int j = high-1;
        while(i<=j) {
        	while(i<=j && a[j]<=pivot) {
        		i++;
        	}
        	while(i<=j && a[j]>=pivot) {
        		j--;
        	}
        	if(i<j) {
        		int t = a[i];
        		a[i] = a[j];
        		a[j] = t;
        	}
        }
        int temp = a[high];
        a[high] = a[i];
        a[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        quicksort(a, 0, n - 1);
        System.out.println();
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
