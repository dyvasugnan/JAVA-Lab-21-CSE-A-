
import java.io.*;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class FileToHT {
	public static void main (String[] args) throws IOException{
		
		// FileOutputStream fo = new FileOutputStream("namesSalary.txt");
		// DataInputStream d = new DataInputStream(System.in);
		// //BufferedOutputStream b = new BufferedOutputStream(fo,1024);
		// char ch;
		// while(( ch = (char)d.read() )!=-1){
		// 	fo.write(ch);
		// }
		// fo.close();


		FileInputStream fi = new FileInputStream("namesSalary.txt");
		Scanner sc = new Scanner(fi).useDelimiter(",");
			System.out.println("hello");
		Hashtable<String,String> ht = new Hashtable<String,String>();

		String line;
		while(sc.hasNextLine()){
			line = sc.nextLine();
			String arr[];
			arr = line.split(",");
			if(arr.length == 2)
			ht.put(arr[0],arr[1]);

		}
System.out.println("Enter a name");
		String name = sc.next();
		if(ht.containsKey(name)){
			System.out.println(ht.get(name));
		}
	


	}


}
