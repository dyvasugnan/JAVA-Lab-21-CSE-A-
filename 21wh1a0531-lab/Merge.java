import java.util.*;
import java.lang.*;
class Merge{
    void merging(int a[],int l,int r){
        if(l<r){
            int m = (l+r)/2;
            merging(a,l,m);
            merging(a,m+1,r);
            mergesort(a,l,m,r);
        }
    }
    void mergesort(int a[],int l,int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        for(int i=0;i<n1;i++){
            a1[i] = a[l+i];
        }
        for(int i=0;i<n2;i++){
            a2[i] = a[m+i+1];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(a1[i]<=a2[j]){
                a[k] = a1[i];
                k++;
                i++;
            }
            else{
                a[k] = a2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            a[k] = a1[i];
            k++;
            i++;
        }
        while(j<n2){
            a[k] = a2[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Main m = new Main();
        m.merging(a,0,a.length-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
