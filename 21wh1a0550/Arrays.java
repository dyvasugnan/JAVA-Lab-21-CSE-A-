package javaclasswork;
import java.util.Scanner;


class Array1D {
	int len;
	int[] array;
	Scanner sc = new Scanner(System.in);
	Array1D(int length){
	this.len = length;
	array = new int[len];
}
void getdata() {
	for(int i=0 ; i < len; i++) {
		array[i] = sc.nextInt();
	}
}

void printdata() {
	for(int num : array) {
		System.out.print(num);
	}
	    System.out.println();
}
}
class Array2D extends Array1D {
	Array1D[] array;
	int rows,columns;
	Array2D(int rows,int columns){
		super(rows);
		this.columns = columns;
		array = new Array1D[rows];
		for(int i=0;i<rows;i++)
			array[i] = new Array1D(columns);
		}
	
void getdata() {
	for(Array1D num : array)
		num.getdata();
}
void printdata() {
	for(Array1D num : array)
		num.printdata();
}
}
class Array3D extends Array2D {
	Array2D[] array;
	int n,r,c;
	Array3D(int n,int r,int c) {
		super(n, r);
		this.c = c;
		array = new Array2D[n];
		for(int i=0;i<n;i++)
			array[i] = new Array2D(r, c);
	}
	void getdata() {
		for(Array2D num : array)
			num.getdata();
	}
	void printdata() {
		for(Array2D num : array)
			num.printdata();
	}
}
class Arrays {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Array1D a1 = new Array1D(5);
		System.out.print("enter elements for 1D array : ");
		a1.getdata();
		System.out.print("the array elements of 1D array are : " );
		a1.printdata();
		
		Array2D a2 = new Array2D(3,3);
		System.out.print("enter elements for 2D array : ");
		a2.getdata();
		System.out.print("the array elements of 2D array are : ");
		a2.printdata();
		
		Array3D a3 = new Array3D(4,4,2);
		System.out.print("enter elements for 3D array : ");
		a3.getdata();
		System.out.print("the array elements of 3D array are : ");
		a3.printdata();
	}
}