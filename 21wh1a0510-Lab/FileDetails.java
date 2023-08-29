import java.io.*;
import java.util.*;
public class FileDetails {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\91707\\eclipse-workspace\\JavaLab\\src\\Constructors");
		File name[] = f.listFiles();
		for(File f1 : name) {
			System.out.println(f1.getName());
		}
}
}
