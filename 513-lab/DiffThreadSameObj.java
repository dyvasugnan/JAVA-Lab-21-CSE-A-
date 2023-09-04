package javalab;
public class DiffThreadSameObj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve r = new Reserve(1);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.setName("Passenger 1");	
		t2.setName("Passenger 2");
		t1.start();
		t2.start();
	}
}
class Reserve extends Thread{
	int wanted;
	int available = 1;
	Reserve(int x){
		wanted = x;
	}

	public void run() {
		synchronized(this){
			//for(int i=0;i<5;i++) {
			if(available>=wanted) {
			System.out.println(wanted+" berth reserved "+this.currentThread().getName());
			}
			else {
				System.out.println("Sorry~!!");
			}
			try {
				Thread.sleep(200);
				available = available-wanted;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			}
		}
	//}
}
