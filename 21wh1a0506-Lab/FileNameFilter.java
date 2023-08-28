package Javalab;
import java.util.*;
import java.io.*;

public class FileArray {

	public static void main(String[] args) {
		String folderPath = ("C:\\Users\\admin\\eclipse-workspace\\JavaLab\\src\\Javalab");
		File folder = new File(folderPath);
		if(folder.isDirectory()) {
			File [] filelist = folder.listFiles();
			if(filelist != null) {
				for(File file:filelist) {
					if(file.isFile()) {
						System.out.println(file.getName());
						System.out.println(file.getAbsolutePath());
						System.out.println(file.getName().endsWith(".java"));
						System.out.println(file.getName().startsWith("D"));
						System.out.println(" ");
					}
				}
			}
		}
	}

}
