import java.util.*;

public class QuickSort {
    public static int pivotIdx(int[] array, int lowidx, int highidx) {
        int pivot = array[lowidx];
        int i = lowidx+1;
        int j = highidx;
        
        while (i <= j) {
            while (array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[j];
        array[j] = pivot;
        array[lowidx] = temp;
        
        return j;
    }
    
    public static void quick(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int idx = pivotIdx(arr, low, high);
            quick(arr, low, idx-1);
            quick(arr, idx+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Before sorting");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nAfter sorting");
        quick(a, 0, n-1);
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
