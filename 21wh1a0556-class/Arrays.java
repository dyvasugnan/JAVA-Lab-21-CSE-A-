import java.util.*;
class Array1D{
    Scanner sc=new Scanner(System.in);
    int len;
    int[] array;
    Array1D(int length){
        len=length;
        array=new int[len];
    }
    void get(){
        for(int i=0;i<len;i++)
        array[i]=sc.nextInt();
    }
    void print(){
        for(int num:array)
        System.out.print(num+" ");
        System.out.println();
    }
}
class Array2D extends Array1D{
    Array1D[] array;
    int r,c;
    Array2D(int r,int c){
        super(r);
        this.c=c;
        array = new Array1D[r];
        for(int i=0;i<r;i++)
        array[i]=new Array1D(c);
    }
    void get(){
        for(Array1D num:array)
        num.get();
    }
    void print(){
        for(Array1D num:array)
        num.print();
    }
}
class Array3D extends Array2D{
    int l,r,c;
    Array2D[] array;
     Array3D(int l,int r,int c){
        super(l,r);
        this.c=c;
        array = new Array2D[l];
        for(int i=0;i<l;i++)
        array[i]=new Array2D(r,c);
    }
    void get(){
        for(Array2D num:array)
        num.get();
    }
    void print(){
        for(Array2D num:array)
        num.print();
    }
}
class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array1D a1= new Array1D(6);
        System.out.print("Enter elements for array1d\n"); 
        a1.get();
        a1.print();
        Array2D a2= new Array2D(3,3);
        System.out.print("Enter elements for array2d\n"); 
        a2.get();
        a2.print();
        Array3D a3= new Array3D(2,3,3);
        System.out.print("Enter elements for array3d\n"); 
        a3.get();
        a3.print();
    }
}
