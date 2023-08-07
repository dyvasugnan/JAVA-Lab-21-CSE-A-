package classnotes_programs;

import java.util.Scanner;

public class ArraysExample {

    // Function to create 1D array
    public static int[] create1DArray(int size) {
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Function to create 2D array
    public static int[][] create2DArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    // Function to create 3D array
    public static int[][][] create3DArray(int depth, int rows, int cols) {
        int[][][] arr = new int[depth][rows][cols];
        Scanner scanner = new Scanner(System.in);
        for (int z = 0; z < depth; z++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element at position (" + (z + 1) + ", " + (i + 1) + ", " + (j + 1) + "): ");
                    arr[z][i][j] = scanner.nextInt();
                }
            }
        }
        return arr;
    }

    // Function to print 1D array
    public static void print1DArray(int[] arr) {
        System.out.println("1D Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Function to print 2D array
    public static void print2DArray(int[][] arr) {
        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to print 3D array
    public static void print3DArray(int[][][] arr) {
        System.out.println("3D Array:");
        for (int z = 0; z < arr.length; z++) {
            System.out.println("Layer " + (z + 1) + ":");
            for (int i = 0; i < arr[z].length; i++) {
                for (int j = 0; j < arr[z][i].length; j++) {
                    System.out.print(arr[z][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1D array
        System.out.print("Enter the size of the 1D array: ");
        int size = scanner.nextInt();
        int[] array1D = create1DArray(size);
        print1DArray(array1D);

        // 2D array
        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int cols = scanner.nextInt();
        int[][] array2D = create2DArray(rows, cols);
        print2DArray(array2D);

        // 3D array
        System.out.print("Enter the depth of the 3D array: ");
        int depth = scanner.nextInt();
        int[][][] array3D = create3DArray(depth, rows, cols);
        print3DArray(array3D);
    }
}
