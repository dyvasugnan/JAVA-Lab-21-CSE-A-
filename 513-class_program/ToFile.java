package javalab;
import java.io.*;
import java.util.*;
public class ToFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Akshaya\\eclipse-workspace\\Sample\\src\\javalab\\hello.txt");
		Scanner sc = new Scanner(file);
		
		String str = "THIS IS A NEW FILE ";
		while(sc.hasNextLine()){
		str = str.concat(sc.nextLine()+"\n");
	}

		FileWriter writer = new FileWriter("C:\\\\Users\\\\Akshaya\\\\eclipse-workspace\\\\Sample\\\\src\\\\javalab\\\\newFile.txt");
		writer.write(str);
		writer.close();
	}
}