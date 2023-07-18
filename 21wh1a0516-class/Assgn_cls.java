
package cs;
import java.util.*;

class Arr1D{
	Scanner sc = new Scanner(System.in);
	int r;
	int arr[];
	Arr1D(int row){
		r = row;
		arr = new int[r];
	}

	void get(){
		for(int i=0;i<r;i++){
			arr[i] = sc.nextInt();
		}
	}

	void print(){
		for(int ele : arr){
			System.out.print(ele+" ");
		}
	}
}

class Arr2D extends Arr1D{
	int c;
	Arr1D a[];

	Arr2D(int row,int col){
		super(row);
		
		c= col;
		a = new Arr1D[row];
	}
	void get(){
		for(int i=0;i<r;i++){
			a[i] = new Arr1D(c);
			a[i].get();
		}
	}

	void print(){
		for(Arr1D ele : a){
			ele.print();
			System.out.println();
		}
	}
}

class Arr3D extends Arr2D{
	int h;
	Arr2D a[];
	Arr3D(int height, int row,int col){
		super(row,col);
		h = height;
		a = new Arr2D[h];
	};

	void get(){
		for(int i=0;i<h;i++){
			a[i] = new Arr2D(r,c);
			a[i].get();
		}
	}

	void print(){
		for(Arr2D ele : a){
			ele.print();
			System.out.println();
		}
	}
}







public class Assgn_cls {
	public static void main(String[] args) {
		Arr1D a = new Arr1D(5);
		a.get();
		a.print();

		System.out.println();

		Arr2D b = new Arr2D(3, 5);
		b.get();
		b.print();
System.out.println();
		Arr3D c = new Arr3D(2,2,3);
		c.get();
		c.print();
		System.out.println();
	}
};
