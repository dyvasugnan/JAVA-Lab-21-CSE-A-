package java;

import java.util.ServiceLoader.Provider;
import java.util.function.Consumer;

public class producerconsumer{
	public static void main(String args []){
		shop c=new shop();
		Provider p1=new Provider(c,1);
		Consumer c1=new Consumer(c,1); 
		p1. start ();
		c1 . start();
	} 
}
class shop{
	private int materials ;
	private boolean available=false ; 
	public synchronized int get (){
		while(available== false){
			try{
				wait (); 
			}
			catch(InterruptedException ie){ }
		}
		available=false ; 
		notifyAll (); 
		return materials ;
	}
	public synchronized void put(int value){
		while ( available==true ){ 
			try{
				wait (); 
			}
			catch(InterruptedException ie){
				ie . printStackTrace ();
			}
		}
		materials=value ; 
		available=true ; 
		notifyAll ();
		@SuppressWarnings("unused")
		class consumer extends Thread{
			private shop shop ;
			private int number;
			@SuppressWarnings("unused")
			public consumer(shop c , int number){
				shop=c;
				this.number=number;
			}
			public void run(){ 
				int value=0;
				for(int i=0;i<10;i++){
					value=shop . get ( ) ;
					System.out.println("consumed val"+this.number+"got : "+value);
				} 
			}
		}
		@SuppressWarnings("unused")
		class producer extends Thread{
			private shop shop ;
			private int number;
			public producer(shop c,int number){
				shop=c ;
				this.number=number;
			}
			public void run(){
				for(int i=0;i<10;i++){ 
					shop.put(i);
					System.out.println("Producer value"+this.number+"Put : "+i); 
					try{
						sleep((int)Math.random()*100); 
					}
					catch(InterruptedException ie){
						ie . printStackTrace ();
					}
				}
			}
		}
	}
}
		
