package javalab;

import java.util.*;

import java.io.*;

public class FileList implements FilenameFilter {



	public static void main(String[] args)throws Exception {

		// TODO Auto-generated method stub

		try {

		File f = new File("C:\\Users\\admin\\Documents");

		String nm[] = f.list();

		System.out.println("NAMES OF FILES!!!");

		for(String i:nm) {

			System.out.println(i); // display name of file with extension

		}

		System.out.println("PATH OF EACH FILES");

		File[] name = f.listFiles();

		for(File i: name) {

			System.out.println(i); //display path of the files

		}

		

		System.out.println("EXTENSIONS: ");

		//FileNameFilter ff = new FileNameFilter(f);

		//System.out.println(ff.endswith(".txt"));

		for(String i:nm) {

		    if(i.endsWith(".txt"))System.out.println(i);

		  }

		

		}catch(Exception e) {

			System.out.println("File not found");

		}

		}



}