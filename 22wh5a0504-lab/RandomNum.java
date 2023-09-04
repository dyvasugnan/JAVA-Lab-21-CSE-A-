package quicksort;

import java.util.Random;

public class RandomNum extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumber r = new RandomNumber();
		r.start();
	}

}

class Even extends Thread{
	int x;
	Even(int n)
	{
		x = n;
	}
	public void run()
	{
		System.out.println("Square: "+ (x*x));
	}
}

class Odd extends Thread{
	int x;
	Odd(int n)
	{
		x = n;
	}
	public void run()
	{
		System.out.println("Cube: " + (x*x*x));
	}
}

class RandomNumber extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			try
			{
				Random r = new Random();
				int n = r.nextInt(20);
				System.out.println("Random number: " + n);
				if(n%2 == 0)
				{
					Even e = new Even(n);
					e.start();
					Thread.sleep(200);
				}
				else
				{
					Odd o = new Odd(n);
					o.start();
					Thread.sleep(200);
				}		
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}