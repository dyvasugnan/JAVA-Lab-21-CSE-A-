package java_codes;
import java.util.*;

class MyThread extends Thread{
	boolean stop=false;
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		if(stop) {
			return;
		}
	}
}

public class Threads {
       public static void main(String args[]) {
    	   MyThread mt = new MyThread();
    	   Threads t = new Threads();
    	   t.task1();
    	   t.task2();
       }
       public void task1() {
    	   System.out.println("Task 1 executed");
       }
       public void task2() {
    	   System.out.println("Task 2 executed");
       }

}


