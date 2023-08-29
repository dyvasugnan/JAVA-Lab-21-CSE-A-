import java.io.*;

public class FileNames {

	public static void main(String args[]) {

		File f = new File("C:\\JAVA");

		//FileInputStream fis = new FileInputStream("C:\JAVA");

		String name[] = f.list();

		for(String s:name) {

			System.out.println(s);       

		}

	}

}