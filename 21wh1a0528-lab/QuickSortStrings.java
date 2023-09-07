
import java.util.*;

public class QuickSortStrings{

    void sort(String[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            sort(arr, low, j - 1);
            sort(arr, j + 1, high);
        }
    }

    int partition(String[] arr, int low, int high) {
        String pivot = arr[low];
        int i = low + 1, j = high;

        while (i <= j) {
            while (i <= j && arr[i].compareTo(pivot) <= 0) {
                i++;
            }
            while (i <= j && arr[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i < j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[j];
        arr[j] = pivot;
        arr[low] = temp;

        return j;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String arr[] = new String[n];
        System.out.print("Enter names : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        QuickSortStrings q = new QuickSortStrings();
        q.sort(arr, 0, n - 1);

        System.out.println("Sorted names:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

