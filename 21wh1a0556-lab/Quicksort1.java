import java.util.*;
public class QuickSort1 {
	
	static int pivot(int a[],int l,int h) {
		int pi=a[h];
		int i=l;
		int j=h-1;
		while(i<j) {
			while(a[i]<=pi && i<h)
				i++;
			while(a[j]>pi && j>=l)
				j--;
			if(i<j) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
				
		}
		int t=a[i];
		a[i]=a[h];
		a[h]=t;
		return i;
	}
	static void sort(int a[],int l,int h) {
		if(l<h) {
			int j=pivot(a,l,h);
			sort(a,l,j-1);
			sort(a,j+1,h);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sort(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}
