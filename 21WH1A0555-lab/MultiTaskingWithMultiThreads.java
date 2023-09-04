package javalab;
import java.util.*;
public class MultiTaskingWithMultiThreads extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mt = new Mythread("cut the ticket");
		Mythread mt1 = new Mythread("show the seat");
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt1);
		t1.start();
		t2.start();
	}
}
class Mythread implements Runnable{
	String name;
	Mythread(String n){
		name=n;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Exception caught");
			}
		}
	}
}