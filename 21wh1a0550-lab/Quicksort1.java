package javaclasswork;
import java.util.*;

public class Quicksort1 {
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

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quickSort(a, low, j - 1);
            quickSort(a, j + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (a[i] <= pivot) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;
    }
}
