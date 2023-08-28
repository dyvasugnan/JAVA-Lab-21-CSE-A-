package classprogram;
import java.io.*;
import java.util.*;
public class FileToHashTable {
public static void main(String args[]) throws IOException{
	FileInputStream fis = new FileInputStream("C:\\Users\\Likitha\\Desktop\\swing.txt");
	Scanner sc = new Scanner(fis).useDelimiter("\t");
	Hashtable<String,String> ht = new Hashtable<String,String>();
	String s;
	String str[] = new String[2];
	while(sc.hasNext()) {
		s = sc.nextLine();
		str = s.split("\t");
		ht.put(str[0], str[1]);
	}
	System.out.print(ht);
}
}
