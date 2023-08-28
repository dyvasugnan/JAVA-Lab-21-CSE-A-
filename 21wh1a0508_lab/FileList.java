package javaLab;
import java.io.*;
import java.util.*;

public class FilePlay {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\cse\\src\\javaLab");
		
		String names[] = f.list();
		for(String x: names) {
			System.out.println(x);
		}
		System.out.print("++++++++++++++++++++++++++++++++++++++");
		
		File obj[] = f.listFiles();
		for(File itr :obj) {
			System.out.println(itr.getName());
			System.out.println(itr.getPath());
			System.out.println(itr.getParentFile());
			System.out.println(itr.getAbsolutePath());
			System.out.println(itr.length());
			System.out.println("...............................");
		}
	}

}
