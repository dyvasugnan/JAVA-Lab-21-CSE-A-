package javalab;
import java.io.*;
import java.util.*;
public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Akshaya\\eclipse-workspace\\Sample\\src\\javalab\\hello.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()){
		System.out.println(sc.nextLine());

	}

}
}
