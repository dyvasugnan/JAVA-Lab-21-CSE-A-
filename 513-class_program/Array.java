package javalab;
import java.util.Scanner;

class Array1D {
    int[] a;

    Array1D(int size) {
        a = new int[size];
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    void display() {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

class Array2D {
    Array1D[] a;

    Array2D(int rows, int cols) {
        a = new Array1D[rows];
        for (int i = 0; i < rows; i++) {
            a[i] = new Array1D(cols);
        }
    }

    void read() {
        for (Array1D row : a) {
            row.read();
        }
    }

    void display() {
        for (Array1D row : a) {
            row.display();
            System.out.println();
        }
    }
}

class Array3D {
    Array2D[] a;

    Array3D(int height, int rows, int cols) {
        a = new Array2D[height];
        for (int i = 0; i < height; i++) {
            a[i] = new Array2D(rows, cols);
        }
    }

    void read() {
        for (Array2D arr2D : a) {
            arr2D.read();
        }
    }

    void display() {
        for (Array2D arr2D : a) {
            arr2D.display();
            System.out.println();
        }
    }
}

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Columns: ");
        int cols = sc.nextInt();
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Height: ");
        int height = sc.nextInt();

        Array3D x = new Array3D(height, rows, cols);
        System.out.println("Enter values for 3D array:");
        x.read();
        System.out.println("3D array:");
        x.display();

        System.out.println("Enter values for 2D array:");
        Array2D y = new Array2D(rows, cols);
        y.read();
        System.out.println("2D array:");
        y.display();

        System.out.println("Enter values for 1D array:");
        Array1D z = new Array1D(cols);
        z.read();
        System.out.println("1D array:");
        z.display();

        sc.close();
    }
}
