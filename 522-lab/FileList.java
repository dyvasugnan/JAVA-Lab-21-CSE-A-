package javalab;
import java.util.*;
import java.io.*;
public class FileList {
	public static void main(String args[]) {
	File f = new File("C:\\Users\\admin\\eclipse-workspace\\cse\\src\\javalab");
	String filess[] = f.list();
	for(String x:filess)
		System.out.println(x);
	
	
	File obj[]=f.listFiles();
		for(File itr : obj) {
				System.out.println(itr.getName());
				System.out.println(itr.getPath());
				System.out.println(itr.getParentFile());
				System.out.println(itr.getAbsolutePath());
				System.out.println(itr.length());
		}
	}	
}
