package javagui2;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
	
	FileInputStream fis = new FileInputStream("abc.txt");
	FileOutputStream fos = new FileOutputStream("fosdemo.txt");
	int data;
	while((data=fis.read())!=-1) {
		fos.write(data);
	}
	while((data=fis.read())!=-1) {
		System.out.println("Data:"+ data);
	}

	System.out.println("File copied");
	fis.close();
	fos.close();
	}
}
