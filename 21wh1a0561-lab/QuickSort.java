package javalab;
import java.util.*;
public class QuickSort {
    public void quickSort(int a[],int l,int h)
    {
        if(l<h)
        {
            int j=partition(a,l,h);
            quickSort(a, j+1, h);
            quickSort(a, l, j-1);
        }
    }
    public int partition(int a[], int l, int h) {
        int pivot = a[l];
        int i = l, j = h;
        while (i < j) {
            while (i <= h && a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;
        return j;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        QuickSort q= new QuickSort();
        System.out.println("Before Sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        q.quickSort(a,0,n-1);
        System.out.println("After Sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}