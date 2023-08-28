package javalab;
import java.io.*;
import java.util.*;

public class FileToTable {
	public static void main(String args[]) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\Hashh.txt");
        Scanner sc = new Scanner(fis).useDelimiter(",");
        Hashtable<String, String> ht = new Hashtable<String, String>();
        String[] str;
        String s;
        while (sc.hasNextLine()){
            s = sc.nextLine();
            str = s.split(",");
            ht.put(str[0], str[1]);
        }
        
        Enumeration<String> keys = ht.keys();  
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            String value = ht.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        Scanner si = new Scanner(System.in);
        String key = si.next();
        
        if(ht.containsKey(key)){
        	String val = ht.get(key);
        			System.out.print(val);
        }
        else
        	System.out.print("Name not found");
    }    
}
