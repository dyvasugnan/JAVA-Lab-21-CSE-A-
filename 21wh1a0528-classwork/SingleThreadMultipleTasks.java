

class MultiThread extends Thread {

	public void run() {

		task1();

		task2();

		task3();

	}

	void task1(){

		System.out.println("task 1");

	}

	void task2() {

		System.out.println("task 2");

	}

	void task3() {

		System.out.println("task 3");

	}

}

public class SingleThreadMultipleTasks {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		MultiThread mt = new MultiThread();

		Thread t = new Thread(mt);

		t.start();

	}



}











































