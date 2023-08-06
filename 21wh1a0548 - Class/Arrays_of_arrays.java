import java.util.*;

class Array1D{
    int arr[];
    int len;
    Array1D(int len){
        this.n=len;
        arr=new int[len];
    }
    void get(){
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
    }
    void print(){
        for(int ele:arr)
            System.out.print(ele+" ");
        System.out.println();
    }
}
class Array2D extends Array1D{
    int row,col;
    Array1D arr[];
    Array2D(int row, int col) {
    super(row);
    this.col = col;
    arr = new Array1D[row];
    for(int i = 0; i < row; i++) {
        arr[i] = new Array1D(col);
    }
    }
    void get(){
        for(Array1D n:arr)
            n.get();
    }
    void print(){
        for(Array1D n:arr)
            n.print();
    }
}

class Array3D extends Array2D {
    Array2D arr[];
    int l, r, c;

    Array3D(int l, int r, int c) {
        super(r, c);
        this.l = l;
        arr = new Array2D[l];
        for (int i = 0; i < l; i++)
            arr[i] = new Array2D(r, c);
    }

    void get() {
        for (Array2D n : arr)
            n.get();
    }

    void print() {
        for (Array2D n : arr)
            n.print();
    }
}

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        Array1D a1 = new Array1D(n);
        System.out.println("Enter elements of Array1D: ");
        a1.read();
        System.out.println("Array1D elements: ");
        a1.display();

        int r=3, c=3;
        Array2D a2 = new Array2D(r, c);
        System.out.println("Enter elements of Array2D : ");
        a2.read();
        System.out.println("Array2D elements : ");
        a2.display();

        int lev=2,r1=3,c1=3;
        Array3D a3 = new Array3D(lev, r1, c1);
        System.out.println("Enter elements of Array3D: ");
        a3.read();
        System.out.println("Array3D elements: ");
        a3.display(); 
    }
}