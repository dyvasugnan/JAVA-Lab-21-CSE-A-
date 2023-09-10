

public class OneThread extends Thread{
	public void run() {
		task1();
		task2();
		task3();
	}
	void task1() {
		System.out.println("Task1 is executing");
	}
	void task2() {
		System.out.println("Task2 is executing");
	}
	void task3() {
		System.out.println("Task3 is executing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneThread ot = new OneThread();
		Thread t = new Thread(ot);
		t.setName("Single thread");
		t.start();
	}
}
