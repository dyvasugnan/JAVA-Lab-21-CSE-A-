package cse526;
 
import java.util.*;

public class DoublyLinkedList
{
public static void main(String args[]) 
{
LinkedList<Integer>dl = new LinkedList<Integer>();
Scanner sc = new Scanner(System.in);
while(true)
{
	System.out.println("1.insert first\n 2.insert last\n 3.delete first\n 4.delete last\n 5.display\n ");
	System.out.println("Enter your choice:");
	int ch = sc.nextInt();
	switch(ch) 
	{
	case 1 :
		System.out.println("Enter element to add at first : ");
		int f = sc.nextInt();
		dl.addFirst(f);
		break;
		
	case 2:
		System.out.println("Enter element to add at last : ");
		int l = sc.nextInt();
		dl.addLast(l);
		break;
		
	case 3:
		dl.removeFirst();
		System.out.println("element deleted");
		break;
		
	case 4:
		dl.removeLast();
		System.out.println("element deleted");
		break;
		
	case 5:
		System.out.println("elements: ");
		for(Integer i:dl) {
			System.out.println(i+"");
		}
		System.out.println();
		break;
	}
	
}
}

}
