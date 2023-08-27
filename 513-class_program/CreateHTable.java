package javalab;
import java.util.*;
public class CreateHTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("Sachin", 90);
		ht.put("Vishwa", 60);
		ht.put("Rahul", 70);
		
		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
            Integer value = ht.get(key);
            System.out.println("Player: " + key + ", Scores: " + value);  
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player name: ");
		String s = sc.next();
		if(ht.containsKey(s)) {
			int val = ht.get(s);
			System.out.println("Scored : "+ val);
		}
		else {
			System.out.println("Player not found!!!");
		}
		
	}

}
