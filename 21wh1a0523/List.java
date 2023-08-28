package javalab;
import java.util.*;
public class List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ele,ch,pos,x;
		LinkedList <Integer> ll = new LinkedList <Integer>();
		while(true) {
			System.out.print("1.Insert\n2.Delete\n3.Search\n4.Display\n5.Exit\n");
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch) {
			case 1: System.out.print("Enter Elements to be inserted: ");
					ele = sc.nextInt();
					ll.add(ele);
					break;
					
			case 2: System.out.print("Enter position of the element to be deleted:\n");
					pos = sc.nextInt();
					Integer obj = ll.remove(pos);
					if(ll.size() > pos)
						System.out.print("Index is out of bound");
					else
					System.out.print("Deleted Element:\n" +obj);
					break;
			
			case 3:System.out.print("Enter elements to  be searched\n");
					x = sc.nextInt();
					int y;
					boolean b =ll.contains(x);
					if(b) {
						y=ll.indexOf(x);
						System.out.print("Element found\n");
					}
					else
						System.out.print("Not Found\n");
					break;
					
			case 4:System.out.print(ll);
					break;
					
			case 5:System.exit(0);
					break;
			
					
			
			}
		}
	}
}
