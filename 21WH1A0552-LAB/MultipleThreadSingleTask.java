
class Reserve extends Thread{
	int a = 2;
	int wanted;
	Reserve(int n){
		wanted = n;
	}
	public void run() {
		synchronized(this) {
			if(a >= wanted) {
			System.out.println("Booking done for "+this.currentThread().getName());
			try {
				Thread.sleep(100);
				a -= wanted;
			}
			catch(Exception e) {
				System.out.println("Exception : "+e);
				}
			}
			else System.out.println("Sorry No Tickets Available");
		}
	}
}
public class MultipleThreadSingleTask extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve mt1 = new Reserve(1);
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt1);
		t1.setName("Passenger 1");
		t2.setName("Passenger 2");
		t1.start();
		t2.start();
	}

}
