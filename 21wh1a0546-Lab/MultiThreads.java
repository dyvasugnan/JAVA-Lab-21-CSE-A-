/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package clss;

import java.util.*;

class MyThreads extends Thread{

	

		String name;

		MyThreads(String n){

			name = n;

		}

		public void run() {

		for(int i = 1; i <= 10; i++) {

			System.out.println(name + ":" + i );

			try {

				Thread.sleep(2000);

			}

			catch(InterruptedException ie) {

				

			}

		}

	}

}

public class MultiThreads {



	public static void main(String[] args) {

		MyThreads mt1 = new MyThreads("Cut the ticket");

		Thread t1 = new Thread(mt1);

		MyThreads mt2 = new MyThreads("Show the seat");

		Thread t2 = new Thread(mt2);

		t1.start();

		t2.start();

	}



}