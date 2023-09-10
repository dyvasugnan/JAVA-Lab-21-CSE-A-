package classnotes_programs;

import java.util.Scanner;

class PivotLowQuickSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        System.out.print("Sorted elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
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
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[low];
        arr[low] = arr[i - 1];
        arr[i - 1] = temp;
        return i - 1;
    }
}
