package classprogram;
import java.io.*;
public class FileOutput  {
public static void main(String args[]) throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	FileOutputStream fos = new FileOutputStream("File.txt");
	char ch;
	while((ch = (char)isr.read())!='@') {
		fos.write(ch);
	}
	FileInputStream fis = new FileInputStream("File.txt");
	int r ;
	while((r=fis.read())!=-1)
		System.out.println((char)r);
}
}
