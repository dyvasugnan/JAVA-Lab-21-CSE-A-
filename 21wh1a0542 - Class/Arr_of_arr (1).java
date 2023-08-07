package java_lab;
import java.util.*;

class Array1D{
	int n;
	int x[];

	Array1D(int len){
		n = len;
		x = new int[n];
	}
	
	void get(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the elements : ");
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
	}
	
	void print() {
		for(int i:x) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

 class Array2D extends Array1D{
	 Array1D x[];
	 int c;
	 Array2D(int r,int c){
		 super(r);
		 this.c = c;
		 x = new Array1D[r];
	 for(int i=0;i<r;i++){
		 x[i]=new Array1D(c);
	 }
	 }
	 
	 void get() {
		 for(Array1D i:x){
			 i.get();
		 }
	 }
	
	 void print(){
		 for(Array1D i:x){
			 i.print();
		 }
	 }
 }

 class Array3D extends Array2D{
	 int l,r,c;
	 Array2D x[]
	 Array3D(int l,int r,int c){
		 super(l,r);
		 this.c = c;
		 x = new Array2D[l];
		 for(int i=0;i<l;i++) {
			 x[i]=new Array2D(r,c);
		 }
	 }
		 
		 void get(){
		 for(Array2D i:x)
			 i.get();
		 }
		 void print() {
			 for(Array2D i:x)
				 i.print();	 
	 }
 }

public class ArraysOfArrays {
	public static void main(String [] args) {
	
		Array2D x1=new Array2D(2,3);
		x1.get();
		x1.print();
		
		Array3D x3=new Array3D(2,2,3);
		x3.get();
		x3.print();
	}
}