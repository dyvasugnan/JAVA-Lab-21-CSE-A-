package javalab;
import java.util.*;

public class DemoHashTable {
	
	public static void main(String[] args) {
		Hashtable <String,Integer>ht=new Hashtable<String,Integer>();
		ht.put( "akhila",10);
		ht.put( "akhil",100);
		ht.put( "khila",50);
		ht.put("khil",99);
		
		Enumeration e=ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("enter key to search : " );
		str=sc.next();
		if(ht.containsKey(str)) {
			System.out.println(ht.get(str));
		}
		else System.out.println("doesnot contain "+str);
		
	}

}
