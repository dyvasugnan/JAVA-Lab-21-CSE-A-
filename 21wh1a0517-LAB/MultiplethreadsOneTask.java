package javalab;

class Reserve extends Thread{
	int avl = 2;
	int wanted ;
		Reserve(int n){
			wanted =  n;
		}
	public void run(){
		synchronized(this){
			if(avl >= wanted){
				System.out.println(wanted+"reserved to" + this.getName());
			try{
				Thread.sleep(200);
				avl = avl - wanted;
			}
			catch(InterruptedException ie ){
				}
			}
			else{
				System.out.println("sorry");
			}
		}
		
	}
}

public class MultiplethreadsOneTask {
   public static void main(String args[]){
	   Reserve r = new Reserve(1);
	   Thread t1  = new Thread(r);
	   Thread t2 = new Thread(r);
	   
	   t1.setName("passenger_1");
	   t2.setName("passenger_2"); 
	   	
	   t1.start();
	   t2.start();
   }
}