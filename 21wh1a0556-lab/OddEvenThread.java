import java.util.*;
public class OddEvenThread  {
public static void main(String args[]) {
	Th1 obj = new Th1();
	obj.start();
}
}
class Th1 extends Thread{
	int n;
	public void run() {
		for(int i = 0;i<10;i++) {
		Random r = new Random();
		n = r.nextInt(5);
		if(n%2==0) {
			Even e = new Even(n);
			e.start();
		}
		else
		{
			Odd o = new Odd(n);
			o.start();
		}
			try {
				Thread.sleep(2);
			}
			catch(InterruptedException ie) {
				System.out.print(ie);
			}
	}
		
	}}
class Even extends Thread{
	int n;
	Even(int n){
		this.n = n;
	}
	public void run() {
		System.out.println("Even number : the square is : "+n*n);
	}
}
class Odd extends Thread{
	int n;
	Odd(int n){
		this.n = n;
	}
	public void run() {
		System.out.println("Odd number : the cube is :"+n*n*n );
	}
}
	
