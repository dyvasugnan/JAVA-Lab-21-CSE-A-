

package javalab;
import java.io.*;
public class StopThread {
	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		MyThread1 mt1 = new MyThread1();
		Thread t = new Thread(mt1);
		t.setName("MyThread");
		t.start();
		System.out.println(t);
		//t.currentThread();
		System.in.read();
		mt1.stop=true;
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class MyThread1 extends Thread{
	boolean stop = false;
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			if(stop) return;
		}
	}
}