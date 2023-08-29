package javagui2;
import java.io.*;
import java.util.*;
public class FileCopy2 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter src file");
		String srcfile = sc.nextLine();
		System.out.println("Enter destination file:");
		String df = sc.nextLine();
	FileInputStream fis = new FileInputStream(srcfile);
	FileOutputStream fos = new FileOutputStream(df);
	int data;
	while((data=fis.read())!=-1) {
		fos.write(data);
	}
	System.out.println("File copied");
	fis.close();
	fos.close();
	}
}
