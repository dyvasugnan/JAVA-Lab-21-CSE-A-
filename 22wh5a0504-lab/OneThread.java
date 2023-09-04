package quicksort;

public class OneThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m = new MyThread();
		m.start();
	}

}


class MyThread extends Thread{
	public void run()
	{
		task1();
		task2();
		task3();
	}
	void task1()
	{
		System.out.println("Task1 executed");
	}
	void task2()
	{
		System.out.println("Task2 executed");
	}
	void task3()
	{
		System.out.println("Task3 executed");
	}
}