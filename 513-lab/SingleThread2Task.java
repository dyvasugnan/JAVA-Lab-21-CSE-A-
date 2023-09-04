package javalab;
public class SingleThread2Task {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThread2 mt2 = new MyThread2();
			Thread t3 = new Thread(mt2);
			System.out.println(t3);
			t3.start();
			//System.out.println(t);
			}
	}
class MyThread2 extends Thread{
	public void run() {
		task1();
		task2();
		task3();
	}
	void task1(){
		System.out.println("Task 1 executed");
	}
	void task2(){
		System.out.println("Task 2 executed");
	}
	void task3(){
		System.out.println("Task 3 executed");
	}
}

