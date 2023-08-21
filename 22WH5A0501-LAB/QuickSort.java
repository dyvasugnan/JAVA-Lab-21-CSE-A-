import java.util.*;
public class QuickSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        a=quicksort(a,0,n-1);
        System.out.println("After sorting");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        sc.close();
    }
    public static int[] quicksort(int a[],int low,int high){
        if(low<high){
            int j=partition(a,low,high);
            quicksort(a,low,j-1);
            quicksort(a,j+1,high);
        }
        return a;
    }
    public static int partition(int a[],int low,int high){
        int pivot=a[low],i=low+1,j=high;
        while(i<=j){
            while(a[i]<=pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t=a[j];
        a[j]=pivot;
        a[low]=t;
        return j;
    }
}