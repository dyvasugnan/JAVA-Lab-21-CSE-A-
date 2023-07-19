import java.util.*;
class Array1D{
    int s;
    int a[];
    Array1D(int s){
        this.s=s;
        a=new int[s];
    }
    void readData(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s;i++)
            a[i]=sc.nextInt();
    }
    void display(){
        for(int num:a)
            System.out.print(num+" ");
        System.out.println();
    }
}

class Array2D extends Array1D{
    int r,c;
    Array1D a[];
    Array2D(int r,int c){
        super(r);
        this.c=c;
        a=new Array1D[r];
        for(int i=0;i<r;i++)
            a[i]=new Array1D(c);
    }
    void readData(){
        for(Array1D num:a)
            num.readData();
    }
    void display(){
        for(Array1D num:a)
            num.display();
    }
}

class Array3D extends Array2D{
    int l,r,c;
    Array2D a[];
    Array3D(int l,int r,int c){
        super(l,r);
        this.c=c;
        a=new Array2D[l];
        for(int i=0;i<l;i++)
            a[i]=new Array2D(r,c);
    }
    void readData(){
        for(Array2D num:a)
            num.readData();
    }
    void display(){
        for(Array2D num:a){
            num.display();
            System.out.println();
        }
    }
}

class Assn {
    public static void main(String args[]){
        Array1D a1=new Array1D(3);
        a1.readData();
        a1.display();
        Array2D a2=new Array2D(2,3);
        a2.readData();
        a2.display();
        Array3D a3=new Array3D(2, 2, 3);
        a3.readData();
        a3.display();
    }
}