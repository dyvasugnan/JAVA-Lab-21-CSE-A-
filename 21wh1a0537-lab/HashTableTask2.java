package javalab;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class HashTableTask2 {
		public static void main (String args[]) throws FileNotFoundException {
			FileInputStream fi = new FileInputStream("C:\\Users\\ammu2\\eclipse-workspace\\javalab\\src\\javalab\\sample.txt");
			Scanner sc = new Scanner(fi).useDelimiter(",");
			
			
			Hashtable<String,String> ht = new Hashtable<String,String>();
			String s;
			
			while(sc.hasNextLine()) {
				s = sc.nextLine();
				String arr[];
				arr = s.split(",");
				ht.put(arr[0], arr[1]);
				System.out.println(ht.get(arr[0]));
			}
			
			Scanner sce = new Scanner(System.in);
			System.out.println("Enter a name");
			String name = sce.next();
			
			if(ht.containsKey(name)) {
				String phn = ht.get(name);
				System.out.println(phn);
			}
			else {
				System.out.println("not present");
			}

		}
}
