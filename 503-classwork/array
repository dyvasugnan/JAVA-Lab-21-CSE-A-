package javalab;
import java.util.Scanner;

class Array1D {
    int len;
    int[] array;
    Scanner sc = new Scanner(System.in);

    Array1D(int len) {
        this.len = len;
        array = new int[len];
    }

    void getdata() {
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
    }

    void printdata() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Array2D extends Array1D {
    Array1D[] array;
    int rows, columns;

    Array2D(int rows, int columns) {
        super(rows);
        this.columns = columns;
        array = new Array1D[rows];
        for (int i = 0; i < rows; i++)
            array[i] = new Array1D(columns);
    }

    void getdata() {
        for (Array1D num : array)
            num.getdata();
    }

    void printdata() {
        for (Array1D num : array)
            num.printdata();
    }
}

class Array3D extends Array2D {
    Array2D[] array;
    int len, r, c;

    Array3D(int l, int r, int c) {
        super(l, r);
        this.c = c;
        array = new Array2D[l];
        for (int i = 0; i < l; i++)
            array[i] = new Array2D(r, c);
    }

    void getdata() {
        for (Array2D num : array)
            num.getdata();
    }

    void printdata() {
        for (Array2D num : array)
            num.printdata();
    }
}

public class Asst_arr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Array1D a1 = new Array1D(5);
        System.out.println("Enter numbers for Array1D:");
        a1.getdata();
        a1.printdata();

        Array2D a2 = new Array2D(3, 3);
        System.out.println("Enter numbers for Array2D:");
        a2.getdata();
        a2.printdata();

        Array3D a3 = new Array3D(2, 3, 3);
        System.out.println("Enter numbers for Array3D:");
        a3.getdata();
        a3.printdata();
    }
}
