package javalab;
import java.util.*;
public class QuickSort_High {
    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quickSort(a, low, j - 1);
            quickSort(a, j + 1, high);
        }
    }    

    public static int partition(int a[], int low, int high) {
        int p = a[high];
        int i = low;
        int j = high-1;
        
        while (i <= j) 
        {
            while (i <= j && a[i] <= p) 
            {
                i++;
            }
            while (i <= j && a[j] >= p) 
            {
                j--;
            }
            if (i < j) 
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[high];
        a[high] = a[i];
        a[i] = t;
        
        return i;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }    
}
