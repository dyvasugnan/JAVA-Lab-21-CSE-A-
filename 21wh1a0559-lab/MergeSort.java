import java.awt.*;
import java.util.*;

class MergeSort {
    int a1[] = new int[20];
    int a2[] = new int[20];
    
    void merge(int l,int m,int h){
        int k = l, i = l, j = m + 1,p;
        while(i <= m && j <= h)
        {
            if(a1[i]<a1[j])
            {
                a2[k] = a1[i];
                i++;
                k++;
            }
            else
            {
                a2[k] = a1[j];
                j++;
                k++;
            }
        }
        while(i<=m)
        {
            a2[k] = a1[i];
            i++;
            k++;
        }
        while(j<=h)
        {
            a2[k] = a1[j];
            j++;
            k++;
        }
        for(p = l; p <= h; p++)
            a1[p] = a2[p];
    }
    
    void mergeSort(int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low,mid,high);
        }
    }
    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        Scanner sc = new Scanner(System.in);
        int i,n,j,temp,count=0;
        n = sc.nextInt();
        for(i=0;i<n;i++){
            m.a1[i] = sc.nextInt();
        }
        m.mergeSort(0,n-1);
        for(i=0;i<n;i++)
            System.out.print(m.a1[i]+" ");
    }
}
