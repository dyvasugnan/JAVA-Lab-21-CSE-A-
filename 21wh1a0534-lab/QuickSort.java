package java_labcodes;
import java.util.*;
public class QuickSort {
    static void quickSort(int a[],int low,int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quickSort(a,low,j);  
            quickSort(a,j+1,high);
        }
    }
    static int partition(int a[],int low,int high) {
        int i = low + 1;
        int j = high;
        int pivot = a[low];
        while(i <= j) {
            while (a[i] <= pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, low, j);
        return j;
    }
    static void swap(int a[],int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(a, 0, n - 1);
        System.out.println("Elements after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}