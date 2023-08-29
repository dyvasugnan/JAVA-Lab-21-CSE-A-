package java_labcodes;
import java.io.*;
public class FileDetail {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\teju1\\OneDrive\\Desktop\\java");
		File n[] = f.listFiles();
		for(File i : n) {
			System.out.println(i.getName());
			System.out.println(i.getPath());
			System.out.println(i.getTotalSpace());
		}
	}

}
