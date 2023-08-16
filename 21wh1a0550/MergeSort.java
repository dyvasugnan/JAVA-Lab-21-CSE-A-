package javaclasswork;
import java.util.*;
class MergeSort {    
    void merge(int a[],int b,int m,int r){
        int left=m-b+1;
        int right=r-m;
        int L[]=new int[left];
        int R[]=new int[right];
        for(int i=0;i<left;i++){
            L[i]=a[i+b];
        }
        for(int i=0;i<right;i++){
            R[i]=a[i+m+1];
        }
        int i=0,j=0;
        int k=b;
        while(i<left&&j<right){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
                k++;
            }
            else{
                a[k]=R[j];
                j++;
                k++;
            }
        }
        while(i<left){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<right){
            a[k]=R[j];
            j++;
            k++;
        }
}
      void mergesort(int a[],int b,int r){
        if(b<r){
            int m=(b+r)/2;
            mergesort(a,b,m);
            mergesort(a,m+1,r);
            merge(a,b,m,r);
        }
    }
public static void main(String[] args) {
    MergeSort m = new MergeSort();
    Scanner sc = new Scanner (System.in);
    System.out.print("enter size of array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.print("enter array elements");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    m.mergesort(a,0,n-1);
    System.out.println("after sorting");
    for(int i=0;i<n;i++) {
        System.out.println(a[i]);
    }
}
}