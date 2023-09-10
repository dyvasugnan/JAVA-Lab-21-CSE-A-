package javalab;

import java.io.*;

public class FolderFilesExist {
	public static void main(String args[])
	{
		File f = new File("C:\\Users\\Renukumar\\Pictures\\kushi\\II-II");
		String name[] = f.list();
		for(String i: name)
		{
			System.out.println(i+" ");
		}
		File names[] = f.listFiles();
		for(File c: names)
		{
			System.out.println(c.getName());
			System.out.println(c.getAbsolutePath());
			System.out.println(c.getUsableSpace());
		}
	}
}