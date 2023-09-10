package labprograms;

import java.io.*;
import java.util.*;
public class PhoneToHashTable {
	public static void main(String args[])throws Exception{
		FileInputStream fis = new FileInputStream("phoneNumbers.txt");
		Scanner sc=new Scanner(fis).useDelimiter("\t");
		Hashtable<String,String>ht=new Hashtable<String,String>();
		String s;
		String str[];
		System.out.println("Values in the table : ");
		while(sc.hasNext())	{
			s=sc.nextLine();
			str=s.split("\t");
			ht.put(str[0],str[1]);
			System.out.println(str[0]+" : "+str[1]);
		}
		System.out.print("Enter the name to search : ");
		String name = sc.next();
		if(ht.containsKey(name)) System.out.println("Phone No: "+ht.get(name));
		else System.out.println("Not Found");
	}
	
}
