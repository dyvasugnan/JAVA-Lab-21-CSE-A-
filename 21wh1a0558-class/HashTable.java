package javalab;
import java.util.*;
import java.io.*;
public class HashTable {
	public static void main(String args[]) {
		Hashtable<String,Integer>ht = new Hashtable<String,Integer>();
		ht.put("aaaa",90);
		ht.put("bbbb",80);
		ht.put("ccc",60);
		ht.put("dddd",100);
		System.out.println(ht);
		Enumeration e = ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(ht.containsKey(s)) {
			System.out.println(ht.get(s));
		}
	}
}
