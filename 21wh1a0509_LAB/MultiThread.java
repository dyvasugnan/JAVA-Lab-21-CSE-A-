package javaclass;
import java.util.*;
public class MultiThread {
	public static void main(String args[]) {
		RandomInt r = new RandomInt();
		r.start();
	}
}
class RandomInt extends Thread{
	int n=0;
	public void run() {
		for(int i=1;i<=5;i++) {
			Random r1 = new Random();
		//	r1.setSeed(100);
			n = r1.nextInt(10);
			System.out.println("Random number:"+n);
			if(n%2==0) {
				t2 o1 = new t2(n);
				o1.start();
			}
			else {
				t3 o2 = new t3(n);
				o2.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println("Exception");
			}
		}
	}	
}
class t2 extends Thread{
	int num;
	t2(int n){
		num = n;
	}
	public void run() {
		System.out.println(num*num);
	}
}
class t3 extends Thread{
	int num;
	t3(int n){
		num = n;
	}
	public void run() {
		System.out.println(num*num*num);
	}
}
