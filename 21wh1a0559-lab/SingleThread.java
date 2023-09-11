public class SingleThread extends Thread{
	public void run() {
		task1();
		task2();
		task3();
	}
	void task1() {
		System.out.println("Task1 is Executing");
	}
	void task2() {
		System.out.println("Task2 is Executing");
	}
	void task3() {
		System.out.println("Task3 is Executing");
	}
	public static void main(String[] args) {
		SingleThread st = new SingleThread();
		Thread t = new Thread(st);
		t.setName("Single Thread");
		t.start();
	}
}
