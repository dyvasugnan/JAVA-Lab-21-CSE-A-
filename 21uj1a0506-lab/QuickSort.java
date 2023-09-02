package javalab;
import java.lang.*;
import java.util.*;

public class QuickSort{
    
    static int partition(int[] a, int i, int j)
    {
        int pivot = a[(i+j)/2];
        
        
        while(i < j)
        {
            while(a[i] < pivot)
            {
                i++;
            }
            while(pivot < a[j])
            {
                j--;
            }
            
            if(i <= j)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }      
        return i;
    }
   static void quicksort(int[] a, int i, int j)
    {
        int pivot_index = partition(a, i, j);
        if(i < pivot_index-1)
        {
            quicksort(a, i, pivot_index-1);
        }
        if(pivot_index < j)
        {
            quicksort(a, pivot_index, j);
        }

    }
	public static void main (String[] args) {
		int[] a = {11, 13, 14, 23, 17, 8, 21 };
		System.out.println("Unsorted array:");
		for(int i: a)
		{
		    System.out.print(i + " ");
		}
		quicksort(a, 0, a.length-1);
		
		System.out.println("\nSorted array:");
		for(int i: a)
		{
		    System.out.print(i + " ");
		}	
	}
}
