import java.io.*;
import java.util.*;
public class FileToHashtable {
	public static void main(String args[])throws Exception{
		
		FileInputStream fis=new FileInputStream("phone_no.txt");
		
		Scanner sc=new Scanner(fis).useDelimiter("\t");

		Hashtable<String,String>ht=new Hashtable<String,String>();

		String s;
		String str[];
		System.out.println("hash table values are : ");
		while(sc.hasNext())	{
		s=sc.nextLine();
		str=s.split("\t");
		ht.put(str[0],str[1]);
		System.out.println(str[0]+" : "+str[1]);
		}
		
		System.out.print("Enter the name as given in the phone book : ");
		Scanner sca = new Scanner(System.in);
		String name=sca.next();
		if(ht.containsKey(name)){
		System.out.println("phone no is "+ht.get(name));
		}
		else{
		System.out.println("name not matched");
		}
	}
	
}

