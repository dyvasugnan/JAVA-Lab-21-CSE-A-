package cse526;

import java.util.*;
import java.io.*;

public class HashTableFile {

	public static void main(String[] args)  throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\cse526\\data.txt");
		Scanner sc = new Scanner(fis).useDelimiter(",");
		Hashtable<String, String> ht = new Hashtable<String,String>();
		String[] str;
		String s;
		while(sc.hasNextLine())
		{
			s = sc.nextLine();
			str = s.split(",");
			ht.put(str[0],str[1]);
		}
		Enumeration<String> keys = ht.keys();
		while(keys.hasMoreElements()) 
		{
			String key = keys.nextElement();
			String value = ht.get(key);
			System.out.println("key:  " + key + ",value: " +value );
			
		}
		sc.close();

	}

}
