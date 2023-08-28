package csea504;

import java.io.*;

public class FileNameExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Program Files\\Java\\jdk-18");
		String name[] = f.list();
		for(String i: name)
		{
			System.out.println(i);
		}
	}

}
