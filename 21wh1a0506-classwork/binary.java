import java.util.*;

class Main {
    public static int binarySearch(int[] a, int key, int low, int high) {
        if (low > high) {
            return -1; // Key not found
        }

        int mid = low + (high - low) / 2;

        if (a[mid] == key) 
            return mid; // Key found at index 'mid'
        else if (a[mid] > key) 
            return binarySearch(a, key, low, mid - 1); // Search in the left half
        else 
            return binarySearch(a, key, mid + 1, high); // Search in the right half
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        while (q-- > 0) {
            int low = 0;
            int high = n - 1;
            int k = sc.nextInt();
            int result = binarySearch(a, k, low, high);
            System.out.println(result);
        }
    }
}
