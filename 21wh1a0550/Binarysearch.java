package javaclasswork;
import java.util.Scanner;
class Binarysearch {
int binarySearch(int a[], int element, int low, int high) {
      while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == element)
               return mid;
            if (a[mid] < element)
               low = mid + 1;
            else
               high = mid - 1;
            }
            return -1;
}

public static void main(String args[]) {
         Binarysearch b = new Binarysearch();

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the sorted elements:");
        for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        }
        

         System.out.println("Enter element to be searched:");
         int element = sc.nextInt();

         int res = b.binarySearch(a, element, 0, n - 1);
         if (res == -1)
              System.out.println("Not found");
         else
              System.out.println("Element found at index " + res);
}
}

