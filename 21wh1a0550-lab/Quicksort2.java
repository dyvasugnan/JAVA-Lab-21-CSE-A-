package javaclasswork;
import java.util.*;

public class Quicksort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        quickSort(a, 0, a.length - 1);
        System.out.print("Sorted Array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int j = partition(array, low, high);
            quickSort(array, low, j - 1);
            quickSort(array, j + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high]; 
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
