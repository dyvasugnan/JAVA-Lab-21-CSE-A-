package javalab;
import java.util.Random;
public class RandomNo_Thread  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNo r = new RandomNo();
		r.start();
	}
}
class RandomNo extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		Random x = new Random();
		int n = x.nextInt(10);
		System.out.println("The number is: " + n);
		if(n%2==0) {
			EvenNo t4 = new EvenNo(n);
			t4.start();
		}
		else {
			OddNo t5 = new OddNo(n);
			t5.start();
		}
		try {
			Thread.sleep(200);
	}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class EvenNo extends Thread{
	int n;
	EvenNo(int x){
		n = x;
	}
	public void run() {
		System.out.println("The square of the even number is: " + n*n);
		System.out.println();
	}
}

class OddNo extends Thread{
	int n;
	OddNo(int x){
		n = x;
	}
	public void run() {
		System.out.println("The cube of the odd number is: "+n*n*n);
		System.out.println();
	}
}
}





