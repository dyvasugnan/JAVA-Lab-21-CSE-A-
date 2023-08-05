package javalab;
import java.util.Scanner;

class Array1D
{
    int row;
    Scanner sc = new Scanner(System.in);
    int arr[];
    Array1D(int row)
    {
        this.row = row;
        arr = new int[row];
    }
    //int arr1[] = new int[size];
    public void readArray()
    {
        //arr1 = new int[row];
        for(int i = 0; i < row; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public void printArray()
    {
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}

class Array2D extends Array1D
{
    int row, col;
    Scanner sc = new Scanner(System.in);
    Array1D arr[];
    Array2D(int row, int col)
    {
        //this.row = row;
        super(row);
        //row = super.row;
        this.col = col;
        arr = new Array1D[row];
        for(int i = 0; i < row; i++)
        {
            arr[i] = new Array1D(col);
        }
    }
    //int arr1[] = new int[size];
    public void readArray()
    {
        //arr = new Array1D[row];
        
        for(Array1D i : arr)
        {
            i.readArray();
        }
    }
    public void printArray()
    {
        for(Array1D i : arr)
        {
            i.printArray();
            System.out.println();
        }
    }
}

class Array3D extends Array2D
{
    int row, col, num;
    Scanner sc = new Scanner(System.in);
    Array2D arr[];
    Array3D(int row, int col, int num)
    {
        super(row, col);
        //this.row2 = row2;
        //this.col2 = col2;
        this.num = num;
        arr = new Array2D[num];
        for(int i = 0; i < num; i++)
        {
            arr[i] = new Array2D(row,col);
        }
    }
    //int arr1[] = new int[size];
    public void readArray()
    {
        
        //arr3 = new Array2D[num];
        for(Array2D i : arr)
        {
            i.readArray();
        }
    }
    public void printArray()
    {
        for(Array2D i : arr)
        {
            i.printArray();
            System.out.println();
        }
    }
}

class Arrays
{
    public static void main(String args[]) 
    {
        Array1D a1 = new Array1D(2);
        a1.readArray();
        System.out.println("1D Array");
        a1.printArray();

        Array2D a2 = new Array2D(2,3);
        a2.readArray();
        System.out.println("2D Array");
        a2.printArray();

        Array3D a3 = new Array3D(2,3,4);
        a3.readArray();
        System.out.println("3D Array");
        a3.printArray();
    }
}
