package javalab;
import java.io.*;
import java.util.LinkedList;

public class FileInfo {

	public static void main(String[] args) {
		File f = new File("C:\\Program Files");
		File name[] = f.listFiles();
		for(File x : name) {
			System.out.println(x.getName());
			System.out.println(x.getFreeSpace());
			System.out.println(x.getPath());
			
		}

	}

}
