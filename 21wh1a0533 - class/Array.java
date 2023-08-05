package javaclass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size for the 1D array:");
        int size1D = scanner.nextInt();
        Array1D array1D = new Array1D(size1D);
        array1D.read();
        array1D.display();

        System.out.println("Enter the dimensions for the 2D array:");
        int rows2D = scanner.nextInt();
        int cols2D = scanner.nextInt();
        Array2D array2D = new Array2D(rows2D, cols2D);
        array2D.read();
        array2D.display();

        System.out.println("Enter the dimensions for the 3D array:");
        int height3D = scanner.nextInt();
        Array3D array3D = new Array3D(height3D, rows2D, cols2D);
        array3D.read();
        array3D.display();
    }
}

class Array1D {
    int[] elements;

    Array1D(int size) {
        elements = new int[size];
    }

    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
    }

    void display() {
        System.out.println("Elements of the array:");
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class Array2D extends Array1D {
    int numColumns;
    Array1D[] rows;

    Array2D(int numRows, int numColumns) {
        super(numRows);
        this.numColumns = numColumns;
        rows = new Array1D[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new Array1D(numColumns);
        }
    }

    void read() {
        for (Array1D row : rows) {
            row.read();
        }
    }

    void display() {
        for (Array1D row : rows) {
            row.display();
        }
    }
}

class Array3D extends Array2D {
    int depth;
    Array2D[] layers;

    Array3D(int depth, int numRows, int numColumns) {
        super(numRows, numColumns);
        this.depth = depth;
        layers = new Array2D[depth];
        for (int i = 0; i < depth; i++) {
            layers[i] = new Array2D(numRows, numColumns);
        }
    }

    void read() {
        for (Array2D layer : layers) {
            layer.read();
        }
    }

    void display() {
        for (Array2D layer : layers) {
            layer.display();
        }
    }
}
