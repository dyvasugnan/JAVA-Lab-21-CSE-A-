package programs;

import java.util.Scanner;

public class QuickSort2 {
    int partition(int a[],int low,int high) {
		int pivot = a[high];
		int i = low;
		int j = high-1;
		while(i<=j) {
			while(i<=j && a[i]<=pivot) i++;
			while(i<=j && pivot<=a[j]) j--;
			if(i<j) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp = a[high];
		pivot = a[i];
		a[i] = temp;
		return i;
    }
    void sort(int a[], int l, int h) {
        if (l < h) {
            int j = partition(a, l, h);
            sort(a, l, j - 1);
            sort(a, j + 1, h);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements into array: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        QuickSort2 obj = new QuickSort2();
        obj.sort(a, 0, n - 1);
        for (int i : a) System.out.print(i + " ");
        System.out.println();
    }
}
