import java.util.*;

public class QuickSort 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        sorting(a, 0, n - 1);
        for (int k = 0; k < n; k++) 
        {
            System.out.print(a[k] + " ");
        }
    }

    public static int pivot(int a[], int low, int high) {
        int p = a[low];
        int i = low + 1;
        int j = high;
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
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int auxiliary = a[low];
        a[low] = a[j];
        a[j] = auxiliary;

        return j;
    }

    public static void sorting(int a[], int low, int high) 
    {
        if (low < high) 
        {
            int j = pivot(a, low, high);
            sorting(a, low, j - 1);
            sorting(a, j + 1, high);
        }
    }
}
