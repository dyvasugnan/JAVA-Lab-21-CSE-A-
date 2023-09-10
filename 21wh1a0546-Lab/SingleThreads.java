/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package clss;

import java.util.*;

class MyThread extends Thread{

	public void run() {

		task1();

		task2();

		task3();

	}

	void task1() {

		System.out.println("task 1 is executed");

	}

	void task2() {

		System.out.println("task 2 is executed");

	}

	void task3() {

		System.out.println("task 3 is executed");

	}

}

public class SingleThread {



	public static void main(String[] args) { 

		MyThread mt = new MyThread();

		Thread t = new Thread(mt);

		t.start();

		



	}



}