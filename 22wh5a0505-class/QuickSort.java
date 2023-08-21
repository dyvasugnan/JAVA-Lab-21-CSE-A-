import java.util.*;

public class QuickSort
{
    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }    

    public static int partition(int arr[], int low, int high)
    {
        int p = arr[l];
        int i = low + 1;
        int j = high;
        
        while (i <= j)
        {
            while (i <= j && arr[i] <= p)
            {
                i++;
            }
            while (i <= j && arr[j] >= p) 
            {
                j--;
            }
            if (i < j)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[l];
        arr[l] = arr[j];
        arr[j] = t;
        
        return j;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }    
}
