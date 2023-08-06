package javaclass;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of 1D array:");
        int size = sc.nextInt();
        Array1d a1d = new Array1d(size);
        a1d.read();
        a1d.display();

        System.out.println("Enter the dimensions of 2D array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        Array2d a2d = new Array2d(rows, cols);
        a2d.read();
        a2d.display();

        System.out.println("Enter the dimensions of 3D array:");
        int height = sc.nextInt();
        Array3d a3d = new Array3d(height, rows, cols);
        a3d.read();
        a3d.display();
    }

}

class Array1d {
    int[] a;

    Array1d(int size) {
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
       
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Array2d extends Array1d {
    int col;
    Array1d[] a;

    Array2d(int row, int col) {
        super(row);
        this.col = col;
        a = new Array1d[row];
        for (int i = 0; i < row; i++) {
            a[i] = new Array1d(col);
        }
    }

    void read() {
        for (Array1d i : a) {
            i.read();
        }
    }

    void display() {
        for (Array1d i : a) {
            i.display();
        }
    }
}

class Array3d extends Array2d {
    int height;
    Array2d[] a;

    Array3d(int height, int row, int col) {
        super(row, col);
        this.height = height;
        a = new Array2d[height];
        for (int i = 0; i < height; i++) {
            a[i] = new Array2d(row, col);
        }
    }

    void read() {
        for (Array2d i : a) {
            i.read();
        }
    }

    void display() {
        for (Array2d i : a) {
            i.display();
        }
    }
}
