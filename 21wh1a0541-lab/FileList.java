package javagui2;

import java.io.*;
public class FileList{
	public static void main(String[] args) {
		File f = new File("C:\\Windows");
		String names[] = f.list();
		for(String n :names) {
			System.out.println(n);
		}
	}
}