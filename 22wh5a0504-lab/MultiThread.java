package quicksort;

public class MultiThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();
		m1.setName("MyThread 1");
		m2.setName("MyThread 2");
		m1.start();
		m2.start();
	}

}


class MyThread1 extends Thread{
	public void run()
	{
		try {
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i + " " + this.currentThread());
				this.sleep(200);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}