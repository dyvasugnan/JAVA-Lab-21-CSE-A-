import java.util.*;

public class quickSort 
{
    public static void quickSorting(int[] a, int l, int h)
    {
        if (l < h)
        {
            int j = partition(a, l, h);
            quickSorting(a, l, j - 1);
            quickSorting(a, j + 1, h);
        }
    }    

    public static int partition(int a[], int l, int h)
    {
        int p = a[l];
        int i = l + 1;
        int j = h;
        
        while (i <= j)
        {
            while (i <= j && a[i] <= p) // Corrected the condition here
            {
                i++;
            }
            while (i <= j && a[j] >= p) // Corrected the condition here
            {
                j--;
            }
            if (i < j)
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }
        }
        
        // Swap pivot with element at index j
        int t = a[l];
        a[l] = a[j];
        a[j] = t;
        
        return j;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        quickSorting(a, 0, n - 1);
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }    
}
