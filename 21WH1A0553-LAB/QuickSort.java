package clss;
import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        
	        int[] arr = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        scanner.close();

	        quickSort(arr, 0, arr.length - 1);
	        System.out.println("Sorted array: " + Arrays.toString(arr));

	}
public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

public static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low + 1;
    
    for (int j = low + 1; j <= high; j++) {
        if (arr[j] < pivot) {
            swap(arr, i, j);
            i++;
        }
    }
    
    swap(arr, low, i - 1);
    return i - 1;
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}