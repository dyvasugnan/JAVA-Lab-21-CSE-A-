import java.util.*;
//last ele as pivot element -> case 2
public class Quicksort {
    static int partition(int[] a, int low, int high) {
        int pivot = a[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
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
