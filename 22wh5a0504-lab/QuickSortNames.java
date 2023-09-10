import java.util.*;

public class QuickSortNames {
    public static int pivotIdx(String[] array, int lowidx, int highidx) {
        String pivot = array[lowidx];
        int i = lowidx+1;
        int j = highidx;
        
        while (i <= j) {
            while (array[i].compareTo(pivot) <= 0) {
                i++;
            }
            while (array[j].compareTo(pivot) > 0) {
                j--;
            }
            
            if (i < j) {
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        String temp = array[j];
        array[j] = pivot;
        array[lowidx] = temp;
        
        return j;
    }
    
    public static void quick(String[] arr, int low, int high)
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
        String a[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.next();
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
        sc.close();
    }
}
