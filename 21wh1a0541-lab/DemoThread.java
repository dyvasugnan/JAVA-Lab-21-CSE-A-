package javagui3;

public class DemoThread {
	public static void main(String[] args) {
		MyThread o1 = new MyThread("cut the ticket");
		MyThread o2 = new MyThread("show the seet");
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);
		t1.start();
		t2.start();
	}
}
class MyThread implements Runnable{
	String name;
	MyThread(String n){
		name = n;
	}
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(name + ":" + i);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
		}
	}
}
}