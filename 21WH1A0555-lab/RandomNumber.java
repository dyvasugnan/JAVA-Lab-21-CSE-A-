package javalab;
import java.util.*;
public class RandomNumber extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1 = new Task1();
		t1.start();

	}
}
class Task1 extends Thread{
	int n;
	public void run() {
		for(int i=1;i<=10;i++) {
			Random r = new Random();
			n = r.nextInt(100);
			System.out.println("Random number generated is : "+ n);
			if(n%2==0) {
				Task2 t2 = new Task2(n);
				t2.start();
			}
			else {
				Task3 t3 = new Task3(n);
				t3.start();
			}
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Exception caught");
			}
		}
	}
}
class Task2 extends Thread{
	int n1;
	Task2(int num1){
		n1=num1;
	}
	public void run() {
		System.out.println("Square of random number: "+n1*n1);
	}
}
class Task3 extends Thread{
	int n2;
	Task3(int num2){
		n2 = num2;
	}
	public void run() {
		System.out.println("Cube of random number: "+n2*n2*n2);
	}
}