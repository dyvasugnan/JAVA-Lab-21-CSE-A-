package javalab;

import java.util.*;
import java.lang.*;

class RandomVariable extends Thread{
	int n;
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Random variable :"+n);
		if(n%2==0) {
			Even te = new Even(n);
			Thread t1 = new Thread(te);
			t1.start();
		}
		else {
			Odd to = new Odd(n);
			Thread t2 = new Thread(to);
			t2.start();
		}	
	}
}

class Even implements Runnable{
	int n;
	Even(int num) {
		n = num;
	}
	public void run() {
		System.out.println("Square of Even number :"+n*n);
	}
}

class Odd implements Runnable{
	int n;
	Odd(int num) {
		n = num;
	}
	public void run() {
		System.out.println("Cube of Odd number :"+n*n*n);
	}
}

public class RandomVariables extends Thread{
	public static void main(String args[]) {
		RandomVariable rv = new RandomVariable();
		Thread t = new Thread(rv);
		t.start();
	}
}
