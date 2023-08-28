package javalab;
import java.io.*;
public class Files {
	public static void main(String[] args) {
	File f = new File("C:\\Users\\admin\\Downloads\\New folder");
	File name[] = f.listFiles();
	for(File f1:name) {
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getTotalSpace());
		System.out.println(f1.getUsableSpace());
		System.out.println();
	}
	}
}
