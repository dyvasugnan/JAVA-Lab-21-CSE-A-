package cse525;

public class MultipleThreadsMultipleTasks 
{

	public static void main(String[] args) 
	{
		MyThread1 obj1 = new MyThread1("Cut");
		MyThread1 obj2 = new MyThread1("Show Seat");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}

class MyThread1 implements Runnable
{
	String name;
	MyThread1(String n)
	{
		name = n;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(name + " : " + i);
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{
				
			}
		}
	}
}
