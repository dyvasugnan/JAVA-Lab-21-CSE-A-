package javaclass;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions for the 1D array:");
        int size = sc.nextInt();
        Array1D a1D = new Array1D(size);
        a1D.read();
        a1D.display();

        System.out.println("Enter the dimensions for the 2D array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        Array2D a2D = new Array2D(rows, cols);
        a2D.read();
        a2D.display();

        System.out.println("Enter the dimensions for the 3D array:");
        int height = sc.nextInt();
        Array3D a3D = new Array3D(height, rows, cols);
        a3D.read();
        a3D.display();
    }

}

class Array1D {
    int[] a;

    Array1D(int size) {
        a = new int[size];
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    void display() {
       // System.out.println("Elements of the array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Array2D extends Array1D {
    int col;
    Array1D[] a;

    Array2D(int row, int col) {
        super(row);
        this.col = col;
        a = new Array1D[row];
        for (int i = 0; i < row; i++) {
            a[i] = new Array1D(col);
        }
    }

    void read() {
        for (Array1D i : a) {
            i.read();
        }
    }

    void display() {
        for (Array1D i : a) {
            i.display();
        }
    }
}

class Array3D extends Array2D {
    int height;
    Array2D[] a;

    Array3D(int height, int row, int col) {
        super(row, col);
        this.height = height;
        a = new Array2D[height];
        for (int i = 0; i < height; i++) {
            a[i] = new Array2D(row, col);
        }
    }

    void read() {
        for (Array2D i : a) {
            i.read();
        }
    }

    void display() {
        for (Array2D i : a) {
            i.display();
        }
    }
}

