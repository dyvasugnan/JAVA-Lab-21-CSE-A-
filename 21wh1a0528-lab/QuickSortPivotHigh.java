import java.util.*;
public class QuickSortPivotHigh {
    public static void sort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            sort(a, low, j - 1);
            sort(a, j + 1, high);
        }
    }    

    public static int partition(int arr[], int low, int high) {
    	int i= low, j = high-1;
		int p = arr[high];
		while(i<=j) {
		while (i<=j && arr[i]<=p ) {
			i++;
		}
		while(i<=j && arr[j]>p) {
			j--;
		}
		if(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			}
		}
		int t = arr[i];
		arr[i] = p;
		arr[high] = t;
		
		return i;
        
        
        
    }
        
        
        
        public static void main(String args[]) {
    		
    		
    		Scanner sc = new Scanner(System.in);
    		System.out.print("Enter number : ");
    		int n = sc.nextInt();
    		
    		int a[]= new int[n];
    		System.out.print("Enter numbers into array :  ");
    		
    		for(int i=0;i<n;i++) {
    			a[i] = sc.nextInt();
    		}
    		
    		QuickSortPivotHigh q = new QuickSortPivotHigh();
    		q.sort(a, 0, n-1);
    		
    		for(int i=0;i<n;i++) {
    			System.out.print(a[i]+" ");
    		}
    		
    	}
    	
    }
