package javaClass;
import java.io.*;
import java.util.*;

public abstract class FileFolder implements FilenameFilter {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Class_508\\src\\javaClass");
		String names[] = f.list();
		for(String x : names) {
			System.out.println(x);
		}
		System.out.println("..........................");
		File obj[] = f.listFiles();
		for(File itr : obj) {
			System.out.println(itr.getName());
			System.out.println(itr.getPath());
			System.out.println(itr.getParentFile());
			System.out.println(itr.getAbsolutePath());
			System.out.println(itr.length());
			System.out.println("...........................");
		}	
		FilenameFilter fnf = new FilenameFilter() {
		 public boolean accept(File dir, String fileName)
		  {
		    if(fileName.endsWith("java")) {
		    	return true;
		    }else return false;
		  }
		};
		 
		 File[] ffiles = f.listFiles(fnf);
		 
		 for(File fs : ffiles) {
			 if (fs.exists()) {
					System.out.println(fs);
				} else {
					System.out.print("file:");
				}
		 }
	}
}
                
