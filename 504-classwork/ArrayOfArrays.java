package moulikaLab;

import java.util.*;

class Array1D{
	int len;
	int array[];
	Array1D(int length){
		len = length;
		array = new int[len];
	}
	void set() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<len; i++) {
			array[i] = sc.nextInt();
		}
		
	}
	
	void print(){
		
		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}

class Array2D extends Array1D {
	Array1D array[];
	int rows, cols;
	Array2D(int rows, int cols){
		super(rows);
		this.cols = cols;
		array = new Array1D[rows];
		for (int i=0; i<rows; i++) {
			array[i] = new Array1D(cols);
		}
	}
	void set() {
		for(Array1D num : array)
			num.set();
	}
	void print() {
		
		for(Array1D num : array) {
			num.print();
		}
	}
	
}

class Array3D extends Array2D{
	Array2D array[];
	int l, r, c;
	Array3D(int l, int r, int c){
		super(l, r);
		this.c = c;
		array = new Array2D[l];
		for(int i=0; i<l; i++) {
			array[i] = new Array2D(r, c);
		}
	}
	
	void get() {
		for(Array2D num : array)
			num.set();
	}
	void print() {
		
		for(Array2D num : array) {
			num.print();
		}
	}
	
}
public class ArrayOfArrays {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values into Array1D");
        Array1D obj1 = new Array1D(3);
        obj1.set();
        System.out.println("Array1D: ");
        obj1.print();
        System.out.println("Enter the values into Array2D");
        Array2D obj2 = new Array2D(2, 3);
        obj2.set();
        System.out.println("Array2D: ");
        obj2.print();
        System.out.println("Enter the values into Array3D");
        Array3D obj3 = new Array3D(2, 3, 2);
        obj3.get();
        System.out.println("Array3D: ");
        obj3.print();

       
    }
}