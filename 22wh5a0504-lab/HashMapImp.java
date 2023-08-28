package csea504;

import java.util.*;

public class HashMapImp {
	public static void main(String args[])
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice\n1.Insert\t2.Delete\t3.Display\t4.Exit");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:{
					System.out.println("Enter your name and marks: ");
					String name = sc.next();
					int marks = sc.nextInt();
					hm.put(name, marks);
				}
				break;
				case 2:{
					System.out.println("Enter student name to be deleted: ");
					String name = sc.next();
					if(hm.containsKey(name))
					{
						System.out.println("Deleted value: " + hm.remove(name));
					}
					else {
						System.out.println("Not found");
					}
				}
				break;
				case 3:{
					Enumeration e = hm.;
					
				}
				case 4:System.exit(0);
				default:System.out.println("Invalid Input");
			}
		}
	}
}
