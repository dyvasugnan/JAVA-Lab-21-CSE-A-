package javaClass;
import java.util.Scanner;

class Occurence{
  
    static int count(int[] arr, int n, int x) {
        int firstIndex = binarySearchFirst(arr, n, x);
        if (firstIndex == -1) {
            return 0;
        }
        int lastIndex = binarySearchLast(arr, n, x);
        return lastIndex - firstIndex + 1;
    }
    
    // Binary search to find the first occurrence of x
    static int binarySearchFirst(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }
    
    // Binary search to find the last occurrence of x
    static int binarySearchLast(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to find occurrences: ");
        int x = scanner.nextInt();
        
        int result = count(arr, n, x);
        System.out.println("Occurrences of " + x + ": " + result);
        
        scanner.close();
    }
}
