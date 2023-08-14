import java.util.*;
class MergeSort{
    int a[] = new int[5];
    int b[] = new int[5];
    int count=0;
   void mergeSort(int low,int high){
       if(low<high)
    {
        int mid = (low + high)/2;
        mergeSort(low, mid);
        mergeSort(mid+1,high);
        merge(low,mid,high);
    }
   }
    void merge(int low,int mid,int high)
{
    int k = low, i = low, j = mid + 1,p;
    while(i <= mid && j <= high)
    {
        if(a[i]<a[j])
        {
            b[k] = a[i];
            i++;
            k++;
        }
         else
        {
            b[k] = a[j];
            j++;
            k++;
        }
    }
    while(i<=mid)
    {
        b[k] = a[i];
        i++;
        k++;
    }
    while(j<=high)
    {
        b[k] = a[j];
        j++;
        k++;
    }
    for(p = low; p <= high; p++)
        a[p] = b[p];
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MergeSort ms = new MergeSort();
        int i,j,n=5;
      
        for(i=0;i<5;i++){
            ms.a[i] = sc.nextInt();
        }
         System.out.print("Array elements before sorting");
        for(i=0;i<5;i++)
            System.out.print(ms.a[i]+ " ");
            int low,high;
            low=0;
            high=5;
            ms.mergeSort(0,4);
            System.out.print("Elements after sorting");
            for(i=0;i<5;i++)
            System.out.print(ms.a[i]+ " ");
   
    }
}
