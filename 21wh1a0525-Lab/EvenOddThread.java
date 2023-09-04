package cse525;

import java.util.*;

public class EvenOddThread {

	public static void main(String[] args) {
		
		GenRandom r = new GenRandom();
		Thread t = new Thread(r);
		t.start();
	}
}

class GenRandom extends Thread
{
	int n;
	public void run()
	{
		Random r = new Random();
		int n = r.nextInt(10);
		System.out.println("Number is : "+n);
		if(n%2 == 0)
		{
			Even e = new Even(n);
			Thread t1 = new Thread(e);
			t1.start();
		}
		else
		{
			Odd o = new Odd(n);
			Thread t2 = new Thread(o);
			t2.start();
		}
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
			
		}
	}
}

class Even extends Thread
{
	int n;
	Even(int n)
	{
		this.n = n;
	}
	public void run()
	{
		System.out.println(n*n);
	}
}

class Odd extends Thread
{
	int n;
	Odd(int n)
	{
		this.n = n;
	}
	public void run()
	{
		System.out.println(n*n*n);
	}
}
