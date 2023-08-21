import java.util.*;
// using first element as pivot element -> case 1 
public class Quicksort {
    static int partition(int[] a, int low, int high) {
        int i = low + 1;
        int j = high;
        int pivot = a[low];
        while (i <= j) {
            while (i <= j && a[i] <= pivot) {
                i++;
            }
            while (i <= j && a[j] > pivot) {
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

    void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quicksort(a, low, j - 1);
            quicksort(a, j + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Quicksort q = new Quicksort();
        q.quicksort(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

