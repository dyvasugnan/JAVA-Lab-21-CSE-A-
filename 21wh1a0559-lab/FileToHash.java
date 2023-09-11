import java.util.*;
import java.io.*;
public class FiletoHash {

	public static void main(String[] args)throws IOException {
		char ch;
		String s;
		String[] str;
		FileInputStream fis = new FileInputStream ("C:\\Users\\admin\\eclipse-workspace\\Adarsha_21560\\src\\javalab\\Data.txt");
		Hashtable <String, String> ht = new Hashtable <String, String>();
		Scanner sc = new Scanner(fis);
		sc.useDelimiter(" ");
		while(sc.hasNextLine()) {
			s = sc.nextLine();
			str = s.split(" ");
			ht.put(str[0], str[1]);
		}
		//System.out.println(ht);
		ht.forEach((key, value)->System.out.println(key+" "+value+"\n"));
	}
}
