package classprogram;
import java.util.*;
public class Mergesort {

	void merge(int a[],int l,int m, int h){
	    int n1 = m-l+1;
	    int n2 = h-m;
	    int a1[] = new int[n1];
	    int a2[] = new int[n2];
	   
	    for(int i = 0;i<n1;i++)
	    a1[i] = a[i+l];
	    for(int j = 0;j<n2;j++)
	    a2[j] = a[m+1+j];
	    int i  =0,j=0,k=l;
	    while(i<n1&&j<n2){
	        if(a1[i]<=a2[j]){
	            a[k] = a1[i];
	            i++;
	        }
	        else{
	            a[k] = a2[j];
	            j++;
	        }
	        k++;
	    }
	    while(i<n1){
	        a[k] = a1[i];
	        i++;
	        k++;
	    }
	    while(j<n2){
	        a[k] = a2[j];
	        j++;
	        k++;
	    }
	}
	void sort(int a[],int l,int h){
	    if(l<h){
	        int mid = (l+h)/2;
	    sort(a,l,mid);
	    sort(a,mid+1,h);
	    merge(a,l,mid,h);}
	}
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array : ");
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i = 0;i<n;i++)
	        a[i] = sc.nextInt();
	        Mergesort obj = new Mergesort();
	        obj.sort(a,0,n-1);
	        for(int i = 0;i<n;i++)
	        System.out.print(a[i]+" ");
	    }
	}


