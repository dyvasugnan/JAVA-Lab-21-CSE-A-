package csea504;

import java.io.File;
import java.io.*;

public class FileDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Program Files\\Java\\jdk-18");
		//FileInputStream fis = new FileInputStream(f);
		File name[] = f.listFiles();
		for(File i : name)
		{
			System.out.print(i.getName() + "\t");
			System.out.print(i.getPath() + "\t");
			System.out.print(i.lastModified() + "\t");
			System.out.print(i.length() + "\t");
			System.out.println();
		}
	}

}
