package java_labcodes;

import java.util.*;

public class Threads extends Thread {

  public static void main(String[] args) {

        Task1 t1 = new Task1();

        t1.start();

	}

}

class Task1 extends Thread{

	int n;

	Random r = new Random();

	public void run() {

		for(int i=1;i<=10;i++) {

			n = r.nextInt(20);

			System.out.println("Random number "+n);

			if(n%2==0) {

				Task2 t2  = new Task2(n);

				t2.run();

			}

			else {

				Task3 t3 = new Task3(n);

				t3.run();

			}

			try {

				Thread.sleep(2000);

			}

			catch(Exception e) {

		}

	}

}

}

class Task2 {

	int n;

	Task2(int number){

		n = number;

	}

	public void run() {

		System.out.println("Square of "+n*n);

	}

}

class Task3 {

	int n;

	Task3(int number){

		n = number;

	}

	public void run() {

		System.out.println("Cube of "+n*n*n);

	}

}