package javalab;
import java.util.Scanner;
import java.lang.Math;
public class PizzaCrust {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int r,c;
		r=read.nextInt();
		c=read.nextInt();
		double cheese=(Math.pow((r-c),2)/Math.pow(r,2))*100;
	    System.out.print(cheese);

	}

}
