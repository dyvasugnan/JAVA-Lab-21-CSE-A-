package cse22505;
import java.io.*;
class Reserve extends Thread{
	int avl=1;
	int wanted;
	Reserve(int n){
		wanted=n;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			if(avl>=wanted) {
				System.out.println(wanted+"Berth reserved to"+this.currentThread());
				try {
					Thread.sleep(200);
					avl=avl-wanted;
				}
				catch(Exception e) {
				}
			}
			else {
				System.out.println("sorry! no seats available");
			}
		}
	}
}

public class ThreadSafeDemo {
	public static void main(String arg[]) {
		Reserve r= new Reserve(1);
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		t1.setName("pass:1");
		t2.setName("pass:2");
		t1.start();
		t2.start();
	}
}
