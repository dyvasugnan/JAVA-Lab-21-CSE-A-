package javaclass;
import java.util.*;
public class QuickSortRandomised {
    public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int j = randomizedPartition(a, low, high);
            quickSort(a, low, j - 1);
            quickSort(a, j + 1, high);
        }
    }
    public static int randomizedPartition(int a[], int low, int high) {
        Random rd = new Random();
        int randomIndex = rd.nextInt(high - low + 1) + low;
        swap(a, randomIndex, low); // Swap random pivot with the first element
        return partition(a, low, high);
    }
    public static int partition(int a[], int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= j && a[i] <= pivot)
                i++;

            while (i <= j && a[j] > pivot)
                j--;

            if (i < j) {
                swap(a, i, j);
            }
        }

        // Swap the pivot with the correct position
        swap(a, low, j);

        return j;
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();
        QuickSortRandomised qs = new QuickSortRandomised();
        qs.quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
