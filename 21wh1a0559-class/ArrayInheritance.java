import java.util.*;
public class ArrayInheritance{
    public static void main(String args[]){
        Array3D a3 = new Array3D(2,3,4);
        System.out.println("Enter the elements : ");
        a3.get();
        System.out.println("Array elements are : ");
        a3.printArr();
    }
}
public class Array1D{
    int len;
    int[] a;
    Array1D(int len){
        this.len = len;
        a = new int[len];
    }
    void get(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<len;i++)
            a[i] = sc.nextInt();
    }
    void printArray(){
        for(int num : a){
            System.out.print(num+" ");
        }
    }
}
public class Array2D extends Array1D{
    int r,c;
    Array1D[] a;
    Array2D(int r, int c){
        super(cols);
        this.rows = r;
        a = new Array1D[r];
        for(int i=0;i<r;i++){
            a[i] = new Array1D(c);
        }
    }
    void get(){
        for(Array1D num: a){
            num.get();
        }
    }
    void printArray(){
        for(Array1D num:a){
            num.printArray();
            System.out.print("\n");
        }
    }
}
class Array3D extends Array2D{
    int lev,r,c;
    Array2D[] a;
    Array3D(int lev, int r, int c){
        super(r,c);
        this.lev = lev;
        a = new Array2D[lev];
        for(int i=0;i<lev;i++){
            a[i] = new Array2D(r,c);
        }
    }
    void get(){
        for(Array2D num : a){
            num.get();
        }
    }
    void printArray(){
        for(Array2D num : a){
            num.printArray();
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
