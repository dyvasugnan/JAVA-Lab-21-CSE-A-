package javagui2;
import java.util.Scanner;
public class QuickSort {
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            quicksort(arr, low, j - 1);
            quicksort(arr, j + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= j && arr[i] < pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } 
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }        
        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        quicksort(arr, 0, n - 1);
        System.out.println();
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
