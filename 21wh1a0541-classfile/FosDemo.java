package javagui2;

import java.io.*;

public class FosDemo  {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileOutputStream fos = new FileOutputStream("fosdemo.txt");
		fos.write(5);
		System.out.println("data is saved");
		fos.close();
	}
}
