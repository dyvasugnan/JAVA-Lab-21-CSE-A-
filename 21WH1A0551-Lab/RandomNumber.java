package labprograms;

import java.util.*;

class RandomNum extends Thread {
    int n;
    RandomNum() {
        Random r = new Random();
        n = r.nextInt(20);
        System.out.println("Random Number : " + n);
        if (n % 2 == 0) {
            Even e = new Even(n);
            e.start();
        }
        else {
            Odd o = new Odd(n);
            o.start();
        }
    }
}
class Even extends Thread {
    int n;
    Even(int x) {
        n = x;
    }
    public void run() {
        System.out.println("Square : " + n * n);
    }
}
class Odd extends Thread {
    int n;
    Odd(int x) {
        n = x;
    }
    public void run() {
        System.out.println("Cube : " + n * n * n);
    }
}

public class RandomNumber extends Thread{
	public static void main(String[] args) {
		RandomNum mt = new RandomNum();
		Thread t = new Thread(mt);
		t.start();
	}
}
