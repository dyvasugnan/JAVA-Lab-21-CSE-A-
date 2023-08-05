import java.util.*;

class Array1D{
    int arr[];
    int n;
    Array1D(int n){
        this.n=n;
        arr=new int[n];
    }
    void read(){
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
    }
    void display(){
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
    void read(){
        for(Array1D ele:arr)
            ele.read();
    }
    void display(){
        for(Array1D ele:arr)
            ele.display();
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

    void read() {
        for (Array2D ele : arr)
            ele.read();
    }

    void display() {
        for (Array2D ele : arr)
            ele.display();
    }
}

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        Array1D a1 = new Array1D(n);
        System.out.println("Enter "+n+" elements into Array1D: ");
        a1.read();
        System.out.println("Array1D elements: ");
        a1.display();

        int r=3, c=3;
        Array2D a2 = new Array2D(r, c);
        System.out.println("Enter "+r*c +" elements into Array2D : ");
        a2.read();
        System.out.println("Array2D elements : ");
        a2.display();

        int lev=2,r1=3,c1=3;
        Array3D a3 = new Array3D(lev, r1, c1);
        System.out.println("Enter " +lev*r1*c1+" elements into Array3D: ");
        a3.read();
        System.out.println("Array3D elements: ");
        a3.display(); 
    }
}