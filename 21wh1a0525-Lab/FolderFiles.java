package cse525;

import java.io.*;
public class FolderFiles 
{
	public static void main(String args[])
	{
		File f = new File("C:\\Users\\admin\\eclipse-workspace1\\cse525\\src\\cse525");
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
