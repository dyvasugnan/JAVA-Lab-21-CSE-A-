package lab;
import java.util.*;
public class QuickLow {
	
	int partition(int a[],int low, int high) {
		
		int i=low+1, j=high, p=a[low];
			
		while(low<j) {
			while(a[i]<=p && i<high)
				i++;
			
			while(a[j]>p && j>low)
				j--;
			
			if(i<j) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
			
			else {
				int tmp = p;
				p = a[j];
				a[j] = tmp;
			}
		}
		return j;
	}
	void quickSort(int a[], int low, int high) {
		if(low < high) {
			int j = partition(a,low,high);
			quickSort(a,low,j-1);
			quickSort(a,j+1,high);
		}
	}
	
	public static void main(String[] args) {
		QuickLow qs = new QuickLow();
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.print("Enter size : ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("array elements : ");
		for(i=0;i<n;i++)
			a[i] = sc.nextInt();
		qs.quickSort(a,0,n-1);
		System.out.print("Sorted Elements: ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
