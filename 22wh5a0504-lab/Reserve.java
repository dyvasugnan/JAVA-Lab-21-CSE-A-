package quicksort;

public class Reserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyReserve r = new MyReserve(1);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
	}

}


class MyReserve extends Thread{
	int avl = 1;
	int wanted;
	MyReserve(int n)
	{
		wanted = n;
	}
	public void run()
	{
		
			for(int i = 0; i < 10; i++)
			{
				if(avl >= wanted)
				{
					System.out.println(wanted + " Seat reserved " + this.getName());
					try {
						Thread.sleep(200);
						avl = avl-wanted;
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				else
				{
					System.out.println("SORRY");
				}
			}
		
	}
}