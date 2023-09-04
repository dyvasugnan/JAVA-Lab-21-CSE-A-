package likhitha;
import java.io.*;
class Th extends Thread{
	
	boolean stop = false;
	public void run() {
		for(int i = 0;i<1000000;i++) {
			if(stop ==true)
				return ;
			System.out.print(i);
		}
	}
	}
public class StopThreadss{
//		boolean stop = false;
//	public void run() {
//		for(int i = 0;i<1000000;i++) {
//			if(stop ==true)
//				return ;
//			System.out.print(i);
//		}
//	}
//	}
		public static void main(String args[]) throws IOException{
			Th st = new Th();
			st.start();
			System.out.print(st.currentThread());
			System.in.read();
			st.stop=true;
		}
	}


