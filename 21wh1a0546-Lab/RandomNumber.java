/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package cse526;

import java.util.*;

public class Number 

{

	public static void main(String[] args)

	{

		RandomNumber  r = new RandomNumber();

		r.start();

	}

}



class RandomNumber extends Thread

{

	int n;

	public void run()

	{

		for(int i = 1;i<=10;i++)

		{

			Random r = new Random();

			n = r.nextInt(100);

			System.out.println("Randomnumber:" + n);

			if(n % 2 == 0)

			{

				Even t2 = new Even(n);

				t2.start();

			}

			else

			{

				Odd t3 = new Odd(n);

				t3.start();

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

}



class Even extends Thread

{

	int n;

	Even(int number){

		n = number;

	}

	public void run()

	{

		System.out.println(n*n);

	}

}



class Odd extends Thread

{

	int n;

	Odd(int number){

		n = number;

	}

	public void run()

	{

		System.out.println(n*n*n);

	}

}