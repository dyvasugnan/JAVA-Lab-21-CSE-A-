package javalab;

public class Task {
	                               
	public static void main(String[] args) {
		MultiThreadMultiTask obj1 = new MultiThreadMultiTask("cut");
		MultiThreadMultiTask obj2 = new MultiThreadMultiTask("show seat");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		}
}
	class MultiThreadMultiTask implements Runnable{
		String s;
		MultiThreadMultiTask(String name){
			s = name;
	   	}
	 	public void run() {
	 		for(int i=0;i<10;i++) {
	 			System.out.println(s + ":" + i);
	 			try {
	 				Thread.sleep(1000);
	 			}
	 			catch(InterruptedException ie) {
	 			}
	 		}
	 	}
	}
