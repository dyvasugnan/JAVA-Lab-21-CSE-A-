import java.util.Scanner;
public class QuickSort2 {
	
	static int pivot(int a[],int l,int h) {
		int pi=a[l];
		int i=l+1;
		int j=h;
		while(i<=j) {
			while(a[i]<=pi&&i<=j)
				i++;
			while(a[j]>pi&&i<=j)
				j--;
			if(i<j) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
				
		}
		int t=a[j];
		a[j]=a[l];
		a[l]=t;
		return j;
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
