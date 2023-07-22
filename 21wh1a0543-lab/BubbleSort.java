package javaprograms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
        System.out.print("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            mat[i] = sc.nextInt();

        int i, j, temp;
        System.out.print("Elements before sorting: ");
        for (i = 0; i < n; i++)
            System.out.print(mat[i] + " ");
        
        
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (mat[j] > mat[j + 1]) {
                    
                    temp = mat[j];
                    mat[j] = mat[j + 1];
                    mat[j + 1] = temp;
                }
            }
        }
        
        System.out.print("\nElements after sorting: ");
        for (i = 0; i < n; i++)
            System.out.print(mat[i] + " ");
    }
}
