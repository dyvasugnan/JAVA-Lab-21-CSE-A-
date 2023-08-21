import java.util.*;

public class QuickSort{
    public static void quickSort(int[] a, int low, int high){
        if (low < high){
            int q = partition(a, low, high);
            quickSort(a, low, q - 1);
            quickSort(a, q + 1, high);
        }
    }    

    public static int partition(int a[], int low, int high){
        int p = a[low];
        int i = low + 1;
        int j = high;
        
        while (i <= j){
            while (i <= j && a[i] <= p)
                i++;
            while (i <= j && a[j] >= p) 
                j--;
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
    
    @SuppressWarnings("resource")
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }    
}