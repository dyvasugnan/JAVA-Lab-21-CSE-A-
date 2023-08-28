package cse525;

import java.util.*;

public class DoublyLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>dl = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Insert first\n2. Insert last\n3. Delete first\n4. Delete last\n5. Add at specific position\n6. Display\n7. Clear list\n8. Exit\n");
		while(true)
		{
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter element to be added at first: ");
				int f = sc.nextInt();
				dl.addFirst(f);
				break;
			case 2:
				System.out.println("Enter element to be added at last: ");
				int l = sc.nextInt();
				dl.addLast(l);
				break;
			case 3:
				dl.removeFirst();
				System.out.println("First element has be deleted");
				break;
			case 4:
				dl.removeLast();
				System.out.println("Last element has be deleted");
				break;
			case 5:
				System.out.println("Enter position and value to be added: ");
				int pos = sc.nextInt();
				int val = sc.nextInt();
				dl.add(pos, val);
				break;
			case 6:
				System.out.print("Elements are: ");
				for(Integer i: dl)
				{
					System.out.print(i+" ");
				}
				System.out.println();
				break;
			case 7:
				dl.clear();
				System.out.println("List has been cleared");
				break;
			case 8:
				System.exit(0);
			}
		}			
	}

}
