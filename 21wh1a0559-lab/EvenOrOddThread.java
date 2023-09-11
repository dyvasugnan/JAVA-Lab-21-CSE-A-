import java.util.*;

public class OddEvenThread  {
public static void main(String args[]) {
	Thread1 t = new Thread1();
	t.start();
}
}
class Thread1 extends Thread{
	int n;
	public void run() {
		for(int i = 0;i<5;i++) {
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
		
	}
}
class Odd extends Thread{
	int n;
	Odd(int n){
		this.n = n;
	}
	public void run() {
		System.out.println(Cube of Odd number :"+n*n*n );
	}
}
class Even extends Thread{
	int n;
	Even(int n){
		this.n = n;
	}
	public void run() {
		System.out.println("Square of Even number : "+n*n);
	}
}
