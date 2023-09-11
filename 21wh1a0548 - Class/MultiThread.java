class MyThread implements Runnable{

	String name;

	MyThread(String n){

		name = n;

	}

	public void run() {

		for(int i=1;i<=100;i++) {

			System.out.println(name + " : "+i);

		}

		try {

			Thread.sleep(2000);

		}

		catch(InterruptedException ie) {

			System.out.println(ie);

		}

	}

}

public class MultiThreadMultiTask {



	public static void main(String[] args) {

		

		MyThread obj1 = new MyThread(" hello ");

		Thread t1 = new Thread (obj1);

		t1.start();

		

		MyThread obj2 = new MyThread(" hi ");

		Thread t2 = new Thread (obj2);

		t2.start();

	}



}