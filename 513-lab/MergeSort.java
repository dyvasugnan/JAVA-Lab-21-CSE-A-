package javalab;
import java.util.*;
public class MergeSort{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        //call for merge, before which call to divide the arrays
        MergeSort m = new MergeSort();
       // int l = 0,r = n-1;
        m.sort(a,0,n-1);
       
        System.out.println("after sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
       
}
    void sort(int a[], int l, int r){
               if(l<r){
                   int m = l + (r-l)/2;
                   sort(a,l,m);
                   sort(a,m+1,r);
               
               merge(a,m,l,r);
               }
           }
           
        void merge(int a[], int m, int l, int r){
            //we have the array now sort    
            int s1 = m-l+1;
            int s2 = r-m;
           
            int[] left = new int[s1];
            int[] right = new int[s2];
           
            for(int i =0;i<s1;i++){
                left[i] = a[l+i];
            }
            for(int j =0;j<s2;j++){
                right[j]=a[m+1+j]; //check
            }
            //copied left[] and right[] now put them back in a[]
            int i = 0,j=0;
            int k = l;
            while(i<s1 && j<s2){
                if(left[i]<=right[j]){
                    a[k]=left[i];
                    i++;
                }
                else{
                    a[k]=right[j];
                    j++;
                }
                k++;
            }
            //for odd number of elements we can have more elements left
            while(i<s1){
                a[k]=left[i];
                i++;
                k++;
            }
            while(j<s2){
                a[k]=right[j];
                j++;
                k++;
            }
           
        }
}