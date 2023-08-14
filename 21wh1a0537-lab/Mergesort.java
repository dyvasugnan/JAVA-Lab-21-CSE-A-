import java.util.*;
public class Mergesort
{    void merge(int a[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=a[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i]=a[i+m+1];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1&&j<n2){
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
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
   
   
}
 void  printarray(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
}
      void mergesort(int a[],int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergesort(a,l,m);
            mergesort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.print("enter size of array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.print("enter array elemnts : ");
for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
Mergesort obj = new Mergesort();
obj.mergesort(a,0,n-1);
   obj.printarray(a,n);

}
}
