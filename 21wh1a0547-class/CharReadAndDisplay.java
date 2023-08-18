package java_lab;
import java.io.*;
public class CharReadAndDisplay {
	public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Any character");
        char x=(char)br.read();
        System.out.println(x);
    }

}
