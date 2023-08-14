import java.util.*;

class MergeSort{
     
      void merging(int a[],int l,int h,int m){
        int c[]=new int[a.length],i = l,j = m+1,k = l;
        while(i<=m && j<=h){
            if(a[i]<a[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=a[j];
                k++;
                j++;
            }
        }
        while(i<=m){
             c[k]=a[i];
                k++;
                i++;
        }
        while(j<=h){
            c[k]=a[j];
                k++;
                j++;
        }
        for(int p=l;p<=h;p++){
            a[p]=c[p];
        }
    }
   
     void mergeSort(int a[],int l,int h){
        int m;
        m = (l+h)/2;
        if(l<h){
            mergeSort(a,l,m);
            mergeSort(a,m+1,h);
            merging(a,l,h,m);
        }
    }
   
    public static void main(String args[]){
       
    Scanner sc = new Scanner(System.in);
    System.out.println("How many : ");
    int n = sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+" numbers : ");
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }

    MergeSort o = new MergeSort();
    o.mergeSort(a,0,n-1);

    System.out.print("After sorting\n");
    for(int i=0;i<n;i++){
    System.out.print(a[i]+" ");
    }
    System.out.println("");
    }
}



