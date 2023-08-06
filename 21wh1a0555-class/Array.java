package usha;

import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Array3D a3 = new Array3D(2,3,4);
        System.out.println("Enter array elements");
        a3.get();
        System.out.println("Array elements");
        a3.printArr();
    }
}
public class Array1D{
    int len;
    int[] arr;
    Array1D(int len){
        this.len = len;
        arr = new int[len];
    }
    void get(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<len;i++)
            arr[i] = sc.nextInt();
    }
    void printArr(){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
public class Array2D extends Array1D{
    int rows,cols;
    Array1D[] arr;
    Array2D(int rows, int cols){
        super(cols);
        this.rows = rows;
        arr = new Array1D[rows];
        for(int i=0;i<rows;i++){
            arr[i] = new Array1D(cols);
        }
    }
    void get(){
        for(Array1D num: arr){
            num.get();
        }
    }
    void printArr(){
        for(Array1D num:arr){
            num.printArr();
            System.out.print("\n");
        }
    }
}
class Array3D extends Array2D{
    int lev,rows,cols;
    Array2D[] arr;
    Array3D(int lev, int rows, int col){
        super(rows,col);
        this.lev = lev;
        arr = new Array2D[lev];
        for(int i=0;i<lev;i++){
            arr[i] = new Array2D(rows,col);
        }
    }
    void get(){
        for(Array2D num : arr){
            num.get();
        }
    }
    void printArr(){
        for(Array2D num : arr){
            num.printArr();
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}