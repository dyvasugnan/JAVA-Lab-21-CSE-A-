package javalab;
//normal quick sort = O(n^2) if smallest or largest element is pivot element then worst case;
//so to reduce to O(nlogn) we use randomized pivot 
import java.util.*;
public class RandQkSort {
	public static void randQS(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            randQS(array, low, pivot - 1);
            randQS(array, pivot+ 1, high);
        }
    }
	public static int partition(int[] a, int low, int high) {
        int randidx = new Random().nextInt(high - low + 1) + low;
        int temp = a[randidx];            //swap random pivot n last
        a[randidx] = a[high];
        a[high] = temp;

        //same
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp1 = a[i];
                a[i] = a[j];
                a[j]=temp1;
            }
        }
        i++;
        int temp2 = a[i];
        a[i] = a[high];
        a[high] = temp2;
        
        return i;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4,6,2,8,9,1 };
        int n = a.length;

        randQS(a, 0, n - 1);

        System.out.println("\nSorted array:");
        for(int i:a) System.out.print(i+" ");
    }


	}


