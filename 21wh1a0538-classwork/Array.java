
package classprogram;
import java.util.*;
class One{
	Scanner sc = new Scanner(System.in);
	int m;
	One(int m){
		this.m = m;
	}
	int a[];
	int[] one() {
		a = new int[m];
		for(int i = 0;i<m;i++) {
			a[i] = sc.nextInt();
		}
		return a;}
	void display1() {
		for(int i = 0;i<m;i++)
			System.out.print(a[i]+" ");
			
	}
}
class Two extends One{
	int n;
	One obj;
	 Two(int m,int n,One obj) {
		super(m);
		this.n = n;
		this.obj = obj;
	}
	 int b[][];
	 int[][] two() {
		 b = new int[m][n];
	 for(int i = 0;i<n;i++) {
	  b[i]=obj.one();
	 }
	 return b;}
	 void display2() {
	 for(int i = 0;i<m;i++) {
		 for(int j = 0;j<n;j++) {
			 System.out.print(b[i][j]+" ");
		 }
		 System.out.println();
	 }
}}
class Three extends Two{
	int h;
	Two obj2;
	Three(int m,int n,int h,One obj,Two obj2){
		super(m,n,obj);
		this.h = h;
		this.obj2 = obj2;
	}
	int c[][][];
	void three() {
		c = new int[m][n][h];
		for(int k = 0;k<h;k++) {
			c[k] = obj2.two();
		}
	}
	void display3() {
		for(int i  =0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				for(int k = 0;k<h;k++) {
					System.out.print(c[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}



public class Array {
  public static void main(String args[]) {
	  int m,n,h;
	  Scanner sc = new Scanner (System.in);
	  System.out.print("Enter the rows : ");
	  m = sc.nextInt();
	  System.out.print("Enter the coulumns : ");
	  n = sc.nextInt();
	  System.out.print("Enter the height : ");
	  h = sc.nextInt();
	  Three t = new Three(m,n,h,new One(m),new Two(m,n,new One(m)));
	  t.one();
	  t.display1();
	  t.two();
	  t.display2();
	  t.three();
	  t.display3();
  }
}
