package javaclass;

import java.util.Scanner;

public class Quick_Sorting {

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int a[], int low, int high) {
        int i = low;
        int j = high - 1;
        int p = a[high];

        while (i <= j) {
            while (a[i] <= p) {
                i++;
            }
            while (a[j] > p) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, i, high);
        return i;
    }

    static void quicksort(int a[], int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quicksort(a, low, j - 1);
            quicksort(a, j + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quicksort(a, 0, n - 1);
        System.out.println("Elements after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

	
