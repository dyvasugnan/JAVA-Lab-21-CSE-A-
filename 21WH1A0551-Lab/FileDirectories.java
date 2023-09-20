package gui;
import java.io.*;

public class FileDirectories {

	
	public static void main(String args[])throws Exception {
		System.out.println("\nFile names");
		File f = new File("C:\\Users\\harsh\\eclipse-workspace\\harsh");
		String names[] = f.list();
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+'\t');
		}
		
		System.out.println("\n\nFile paths\t\tFile names :");
		
		File paths[]=f.listFiles();
		for(File fi : paths) {
			System.out.print(fi.getPath()+"\t");
			System.out.print(fi.getName()+"\t");
			System.out.println();
		}		
		
		FilenameFilter ff = new FilenameFilter() {
			public boolean accept(File f,String name) {
				return name.endsWith(".txt");
			}
		};
		
		File files[]=f.listFiles(ff);
		System.out.println("\nText Files : ");
		for(int i=0;i<files.length;i++) {
			System.out.print(files[i].getName()+"\t");
		}
	
	}
	
}
