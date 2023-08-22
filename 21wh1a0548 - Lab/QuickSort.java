import java.util.Arrays;
import java.util.Scanner;

public class Quick{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int left = low + 1;
        int right = high;

        while (left <= right) {
            while (left <= right && array[left] <= pivot) {
                left++;
            }

            while (left <= right && array[right] > pivot) {
                right--;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        int temp = array[low];
        array[low] = array[right];
        array[right] = temp;

        return right;
    }
}