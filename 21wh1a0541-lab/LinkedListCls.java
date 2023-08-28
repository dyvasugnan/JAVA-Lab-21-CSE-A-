package javagui2;

import java.util.*;

public class  LinkedListCls{
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	LinkedList <Integer> ll = new LinkedList<>();
	do{
		System.out.println("1.add_ele 2.addFirst 3.addLast 4.remove_ele 5.removeFirst 6.removeLast 7.Size 8.clear 9.get 10.print_list  11.exit");
		System.out.println("Enter ur choice:");
		int c=sc.nextInt();
		switch(c) {
		case 1:System.out.println("Enter element to be added:");
				int e1 = sc.nextInt();
				ll.add(e1);
				break;
		case 2:System.out.println("Enter element to be added first:");
				int e2 = sc.nextInt();
				ll.addFirst(20);
				break;
		case 3:System.out.println("Enter element to be added Last:");
				int e3 = sc.nextInt();
				ll.addLast(e3);
				break;
		case 4:
				System.out.println("Enter position to remove element:");
				int pos=sc.nextInt();
				ll.remove(pos);
				break;
		case 5:
				System.out.println("Removing the First Element");
				ll.removeFirst();
				break;
		case 6:
				System.out.println("Removing the Last Element");
				ll.removeLast();
				break;
		case 7:
				System.out.println("The size of the linkedlist is:");
					ll.size();
					break;
		case 8:
				System.out.println("Clearing the linked list");
				ll.clear();
				break;
		case 9:
				System.out.println("Get the element from the linked list");
				System.out.println("Enter the position to get the element");
				int pos1=sc.nextInt();
				ll.get(pos1);
				break;
		case 10:
				System.out.println("Display th elements");
				System.out.println(ll);
				break;
		case 11:System.out.println("Exit");
				System.exit(0);
				break;
		}	
	}while(true);
}
}
