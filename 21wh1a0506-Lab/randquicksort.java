package javalab;
import java.util.*;

public class RandomizedQuickSort {
    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = randomizedPartition(array, low, high);
            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }
    
    public static int randomizedPartition(int[] array, int low, int high) {
        Random random = new Random();
        int randomIndex = random.nextInt(high - low + 1) + low;
        swap(array, randomIndex, low); // Swap random pivot with the first element
        return partition(array, low, high);
    }
    
    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;
        
        while (i <= j) {
            while (i <= j && array[i] <= pivot)
                i++;
            
            while (i <= j && array[j] > pivot)
                j--;
            
            if (i < j) {
                swap(array, i, j);
            }
        }
        
        // Swap the pivot with the correct position
        swap(array, low, j);
        
        return j;
    }
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        
        scanner.close();
        
        RandomizedQuickSort sorter = new RandomizedQuickSort();
        sorter.sort(array, 0, n - 1);
        
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
}
