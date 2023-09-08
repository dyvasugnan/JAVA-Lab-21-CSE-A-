package javalab;
import java.io.*;
import java.util.*;
public class FileFolders implements FilenameFilter {
public static void main(String args[]) throws IOException {
	File  f = new File("C:\\CSE B");
//	String str[] = new String[100];
//	str = f.list();
//	for(int i = 0;i<str.length;i++)
//		System.out.println(str[i]);
	
	File fi[] = f.listFiles();
	FileFolders obj = new FileFolders();
	for(File fn : fi) {
		if(obj.accept(fn,".txt")) {
		System.out.println(fn.getName());
		System.out.println(fn.getAbsolutePath());
		System.out.println(fn.getTotalSpace());
	}}
	
}
public  boolean accept(File f,String s) {
	return (f.getName().endsWith(s));
}
}
//C:\\Users\\admin\\Documents
//C:\\CSE B
//