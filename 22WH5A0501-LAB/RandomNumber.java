package cse22501;
import java.util.Random;
public class RandomNumber extends Thread {
	public static void main(String[] args) {
		T1 tr=new T1();
		tr.start();
	}
}
class T2 extends Thread{
	int x;
	T2(int n){
		x=n;
	}
	public void run() {
		System.out.println("Square:"+x*x);
	}
}
class T3 extends Thread{
	int x;
	T3(int n){
		x=n;
	}
	public void run() {
		System.out.println("Cube:"+x*x*x);
	}
}
class T1  extends Thread{
	public void run() {
		Random r=new Random();
		for(int i=1;i<=5;i++) {
			int x=r.nextInt(20);
			System.out.println("Random number:"+x);
			if(x%2==0) {
				T2 te=new T2(x);
				te.start();
			}
			else {
				T3 to=new T3(x);
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