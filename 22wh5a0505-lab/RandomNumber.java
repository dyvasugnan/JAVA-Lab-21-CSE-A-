package cse22505;
import java.io.*;
import java.util.Random;
import java.util.random.*;
public class RandomNumber extends Thread {
	public static void main(String arg[]) {
		T1 t=new T1();
		t.start();
	}
}
class t2 extends Thread{
	int n;
	t2(int number){
		n=number;
	}
	public void run() {
		System.out.println("square :"+n*n);
	}
}
class t3 extends Thread{
	int n;
	t3(int number){
		n=number;
	}
	public void run() {
		System.out.println("cube :"+n*n*n);
	}
}
class T1 extends Thread{
	public void run() {
		Random r=new Random(20);
		for(int i=1;i<=5;i++) {
			int n=r.nextInt(20);
			System.out.println("Random Number:"+n);
			if(n%2==0) {
				t2 te=new t2(n);
				te.start();
			}
			else {
				t3 to=new t3(n);
				to.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
			}
		}
	}
}