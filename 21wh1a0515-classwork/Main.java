package javalab;
import java.util.*;

class Array1D{
	int len;
	int[] array;
	Scanner sc = new Scanner(System.in);
	Array1D(int length){
		len=length;
		array=new int[len];
	}
	void get() {
		for(int i=0;i<len;i++) {
			array[i]=sc.nextInt();
		}
	}
	void print() {
		for(int num:array) {
			System.out.println(num);
		}
	}
}

class Array2D extends Array1D{
	Array1D[] array;
	int rows,colms;
	Array2D(int rows,int colms){
		super(rows);
		this.colms=colms;
		array=new Array1D[rows];
	for(int i=0;i<rows;i++) {
		array[i]=new Array1D(colms);
	}
	}
	void get() {
		for(Array1D num:array) {
			num.get();
		}
	}
	void print() {
		for(Array1D num:array) {
			num.print();
		}
	}
}

class Array3D extends Array2D{
	int l,r,c;
	Array2D[] array;
	Array3D(int l,int r,int c){
		super(r,c);
		this.l=l;
		array=new Array2D[l];
		for(int i=0;i<l;i++) {
			array[i]=new Array2D(r,c);
		}
	}
	void get() {
		for(Array2D num:array) {
			num.get();
		}
	}
	void print() {
		for(Array2D num:array) {
			num.print();
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1D a1 = new Array1D(5);
		System.out.println("Enter 1D array elements:");
		a1.get();
		a1.print();
		Array2D a2 = new Array2D(3,3);
		System.out.println("Enter 2D array elements:");
		a2.get();
		a2.print();
		Array3D a3= new Array3D(2,3,3);
		System.out.println("Enter 3D array elements:");
		a3.get();
		a3.print();
	}

}
