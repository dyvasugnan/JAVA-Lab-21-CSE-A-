public class SingleThreadMultipletasks 
{

	public static void main(String[] args)
	{
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
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
	public static void task1()
	{
		System.out.println("task1: 1");
	}
	public static void task2()
	{
		System.out.println("task2: 2");
	}
	public static void task3()
	{
		System.out.println("task3: 3");
	}
}
