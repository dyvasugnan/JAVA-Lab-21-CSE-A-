package javalab;

public class OneThreadMultipleTask {

	public static void main(String[] args) 
	{
		MyThread obj =  new MyThread();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}

class MyThread extends Thread
{
	public void run()
	{
		task1();
		task2();
		task3();
	}
		public void task1()
		{
			System.out.println("task 1 is executed");
		}
		public void task2()
		{
			System.out.println("task 2 is executed");
		}
		public void task3()
		{
			System.out.println("task 3 is executed");
		}
	}