import java.util.*;
class MergeSort{
    int a[] = new int[8];
    int b[] = new int[8];
    int count = 0;
    void mergeSort(int l, int h){
        int m = (l + h)/2;
        if(l<h){
            mergeSort(l,m);
            mergeSort(m+1,h);
            merge(l,m,h);
        }
    }
    
    void merge(int l, int m, int h){
        int k=l,i=l,j=m+1,p;
        while(l<=m && j<=h){
            if(a[i] < a[j]){
                b[k] = a[i];
                k++;
                i++;
            }
             else{
                b[k] = a[j];
                j++;
                k++;
            }
        }
        while(i<=m){
            b[k] = a[i];
            i++;
            k++;
        }
        while(j<=h){
            b[k] = a[j];
            j++;
            k++;
        }
        for(p = l; p <= h; p++)
            a[p] = b[p];
    }
    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter array elements ");
        for(i=0;i<8;i++)
            ms.a[i] = sc.nextInt();
        System.out.println("Array elements before sorting ");
        for(i=0;i<8;i++)
            System.out.print(ms.a[i]+" ");
        ms.mergeSort(0, 7);
        System.out.println("\nElements after sorting");
        for(i=0;i<8;i++)
            System.out.print(ms.a[i]+" ");
    }
}
