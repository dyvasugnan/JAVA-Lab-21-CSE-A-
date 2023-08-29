package javalab;
import java.io.*;
public class FileInfo {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\mnsin\\eclipse-workspace\\Javaclasswork\\src\\javalab");
		File name[] = f.listFiles();
		for(File x : name) {
			System.out.print(x.getName());
			System.out.print(x.getFreeSpace());
			System.out.print(x.getPath());
			
		}
	}

}
