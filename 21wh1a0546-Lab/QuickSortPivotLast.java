package clss;
import java.util.*;
public class QuickSortPivotLast {

	static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        
        return i;
    }
    static void quicksort(int arr[], int low, int high){
    	if(low < high) {
        int pivId = partition(arr,low,high);
        quicksort(arr,low,pivId-1);
        quicksort(arr,pivId+1,high);
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i <n; i++){
		    a[i] = sc.nextInt();
		}
		quicksort(a,0,n-1);
		System.out.println("The sorted array after quicksort is : ");
		for(int i = 0; i < n; i++){
		    System.out.print(a[i]+ " ");
		}
		System.out.println();
	}

}
