import java.util.*;
class squareEven extends Thread{

	int num;
	squareEven(int n){
		num = n;
	}
	public void run(){
	System.out.println(num*num);
	}
}
class cubeOdd extends Thread{

	int num;
	cubeOdd(int n){
		num = n;
	}
	public void run(){
	System.out.println(num*num*num);
	}
}

class rando extends Thread{
	
	public void run(){
		Random r = new Random();
		int ri = r.nextInt(100);
		System.out.println("num: "+ ri);
		if(ri%2==0){
			squareEven s = new squareEven(ri);
			s.start();
		}else{
			cubeOdd c = new cubeOdd(ri);
			c.start();
		}
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}

	}
}


public class randomGen {
	public static void main(String[] args) {
		rando rn = new rando();
		Thread t = new Thread(rn);
		t.start();

	}
}
