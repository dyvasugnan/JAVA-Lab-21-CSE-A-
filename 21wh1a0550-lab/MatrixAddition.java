package javaclasswork;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String args[]) {
		int a[][] = {{1,2,3},{3,6,5},{7,8,4}};
		int b[][] = {{3,4,5},{8,9,4},{6,9,8}};
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		