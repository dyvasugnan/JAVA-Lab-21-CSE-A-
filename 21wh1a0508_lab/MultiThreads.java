import java.util.*;
class Even extends Thread{
	int n;
	Even(int num){
		n = num;
	}
	public void run() {
		System.out.println(n + " is even number and its square is "+n*n);
	}
}
class Odd extends Thread{
	int n;
	Odd(int num){
		n = num;
	}
	public void run() {
		System.out.println(n + " is odd number and its cube is "+n*n*n);
	}
}
class RandomNumber extends Thread{
	int n;
	public void run() {
		for(int i=1;i<=10;i++) {
			Random r = new Random();
			n = r.nextInt(20);
			System.out.println("Random number is : "+n);
			if(n%2==0) {
				Even t2 = new Even(n);
				t2.start();
			}
			else {
				Odd t3 = new Odd(n);
				t3.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}
}
public class MultiThreads {
	public static void main(String args[]) {
		RandomNumber t1 = new RandomNumber();
		t1.start();
	}
}
