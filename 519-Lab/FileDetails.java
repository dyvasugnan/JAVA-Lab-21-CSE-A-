package java_labcodes;
import java.io.*;
public class FileDetails {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\teju1\\OneDrive\\Desktop\\java");
		File name[] = f.listFiles();
		for(File f1 : name) {
			System.out.println(f1.getName());
		}
}

}
