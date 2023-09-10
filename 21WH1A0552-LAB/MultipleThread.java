
public class MultipleThread extends Thread{
	String text;
	MultipleThread(String s){
		text = s;
	}
	public void run() {
		System.out.println(text);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleThread mt1 = new MultipleThread("Cut the tickets");
		MultipleThread mt2 = new MultipleThread("Showing the seats");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
	}
}
