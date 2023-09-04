package javalab;
public class ThreadDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.setName("1st Thread");
		t.start();
		System.out.println(t);
	}
}

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}		
	}
}