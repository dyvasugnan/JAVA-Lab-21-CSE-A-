package cse526;

class Reserve extends Thread
{
	int avl = 2;
	int wanted ;
	Reserve(int n)
	{
		wanted =  n;
	}
	public void run()
	{
		synchronized(this)
		{
		//for(int i = 1;i<=2;i++)
		//{
			if(avl >= wanted)
			{
				System.out.println(wanted+"reserved to" + this.getName());
				try
				{
					Thread.sleep(200);
					avl = avl - wanted;
				}
				catch(InterruptedException ie )
				{
					
				}
			}
			else
			{
				System.out.println("sorry");
			}
		}
		//}
		}
}

public class MultipleThreadsoneTasks {
   public static void main(String args[])
   {
	   Reserve r = new Reserve(1);
	   
	   Thread t1  = new Thread(r);
	   Thread t2 = new Thread(r);
	   
	   t1.setName("passenger1");
	   t2.setName("passenger2"); 
	   	
	   t1.start();
	   t2.start();
   }
}
