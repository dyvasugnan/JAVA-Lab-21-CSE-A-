package cs;
import java.util.*;

class Array1D{
	int c;
	Array1D(int c){
		this.c = c;
	}

	Scanner sc = new Scanner(System.in);
	int[] read(int a[]){
		for(int i=0;i<c;i++){
			a[i] = sc.nextInt();
		}
		return a;
	}
	void display(int a[]){
		for(int i=0;i<c;i++){
			System.out.print(a[i]+" ");
		}
	}

};

class Array2D extends Array1D{
	int r;
	Array2D(int r,int c){
		super(c);
		this.r = r;
	}
	
	int[][] read(int b[][]){
		for(int i=0;i<r;i++){
			super.read(b[i]);
		}
		return b;
	}
	void display(int b[][]){
		for(int i=0;i<r;i++){
			super.display(b[i]);
			System.out.println("");
		}
	}
	
}
		

class Array3D extends Array2D{
	int h;
	Array3D	(int h,int r,int c){
		super(r,c);
		this.h = h;
	}
	int [][][] read(int s[][][]){
		for(int i=0;i<h;i++){
			super.read(s[i]);
		}
		return s;
	}

	void display(int s[][][]){
		for(int i=0;i<h;i++){
			super.display(s[i]);
			System.out.println();
		}
	}
	
}

class Assgn{
	public static void main(String args[]){
		Array1D obj = new Array1D(3);
		int a[] = new int[3];
		a = obj.read(a);
		obj.display(a);

		Array2D obj2 = new Array2D(2, 3);
		int[][] b = new int[2][3];
		b = obj2.read(b);
		obj2.display(b);

		Array3D obj3 = new Array3D(4,2,3);
		int [][][]c = new int[4][2][3];
		c = obj3.read(c);
		obj3.display(c);

	}
}







