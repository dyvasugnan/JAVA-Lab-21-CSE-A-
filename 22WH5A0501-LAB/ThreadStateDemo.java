package cse22501;
import java.io.*;

class Reserve extends Thread{
	int avl=1;
	int wanted;
	Reserve(int x){
		wanted=x;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			if(avl>=wanted) {
				System.out.println(wanted+" Berths reserved to "+this.currentThread());
				try {
					Thread.sleep(200);
					avl-=wanted;
				}
				catch(Exception e) {	
				}
			}
			else {
				System.out.println("sorry,no available seats");
			}
		}
	}
}
public class ThreadStateDemo {

	public static void main(String[] args) {
		Reserve r=new Reserve(1);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.setName("Pass:1");
		t2.setName("pass:2");
		t1.start();
		t2.start();
	}

}
