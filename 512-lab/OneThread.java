package javalab;

public class OneThread extends Thread {
	public static void main(String[] args) {
		OneThread t = new OneThread();
		t.start();
	}
	public void run() {
		task1();
		task2();
		task3();
		
	}
	public void task1() {
		System.out.println("1");
	}
	public void task2() {
		System.out.println("2");
	}
	public void task3() {
		System.out.println("3");
	}
}
