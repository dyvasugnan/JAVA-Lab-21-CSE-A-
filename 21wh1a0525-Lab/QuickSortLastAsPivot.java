import java.util.*;

public class QuickSortLastAsPivot{
    public static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int j = partition(a, l, h);
            quickSort(a, l, j - 1);
            quickSort(a, j + 1, h);
        }
    }    

    public static int partition(int a[], int l, int h) {
        int p = a[h];
        int i = l;
        int j = h-1;
        
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
        int t = a[h];
        a[h] = a[i];
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
