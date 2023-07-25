package classprogram;
import java.io.*;
public class IOStringIntegerCharacterReading {
	public static void main(String args[])throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s = br.readLine();
	int t = Integer.parseInt(br.readLine());
	char ch = (char)br.read();
	System.out.println(s+" "+t+" "+ch);
}}
