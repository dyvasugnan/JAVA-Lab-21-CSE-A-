import java.util.*;
public class Quicksorthigh {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        quicksort(a,0,n-1);
        System.out.println("After sorting");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        sc.close();
    }
    public static void quicksort(int a[],int low,int high){
        if(low<high){
            int j=partition(a,low,high);
            quicksort(a,low,j-1);
            quicksort(a,j+1,high);
        }
    }
    public static int partition(int a[],int low,int high){
        int pivot=a[high],i=low,j=high-1;
        while(i<=j){
            while(a[i]<=pivot){
                i++;
            }
            while(a[j]>=pivot){
                j--;
            }
            if(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t=a[i];
        a[i]=a[high];
        a[high]=t;
        return i;
    }
}