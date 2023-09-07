package javalab;

import java.util.Random;

public class MultiThreads{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumber r = new RandomNumber();
		r.start();
	}

}

class Even extends Thread{
	int n;
	Even(int num)
	{
		n = num;
	}
	public void run()
	{
		System.out.println("Square: "+ (n*n));
	}
}

class Odd extends Thread{
	int n;
	Odd(int num)
	{
		n = num;
	}
	public void run()
	{
		System.out.println("Cube: " + (n*n*n));
	}
}

class RandomNumber extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{
				Random r = new Random();
				int n = r.nextInt(10);
				System.out.println("Random number: " + n);
				if(n%2 == 0)
				{
					Even t2 = new Even(n);
					t2.start();
				}
				else
				{
					Odd t3 = new Odd(n);
					t3.start();
				}		
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}