package javalab;
import java.io.*;
public class Filenames {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\mnsin\\eclipse-workspace\\Javaclasswork\\src\\javalab");
		String name[] = f.list();
		for(String str : name) {
			System.out.print(str);
		}
		
	}

}
