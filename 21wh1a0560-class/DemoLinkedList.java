package javaclass;

import java.util.*;
public class DemoLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList <Integer> ll = new LinkedList <Integer> ();
		int ch,ele,pos;
		
		while(true) {
			System.out.println("1. add \n2.exit\n3.add at first\n4.add at last\n5.add at position\n6.remove an int\n7.remove at index\n8.print");
			System.out.print("9.search\n10.clear linked list\nenter you choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1 : ele = sc.nextInt();
					 ll.add(ele);
					 break;
			case 2 : System.exit(0);
			break;
			case 3 : ele = sc.nextInt();
					 ll.addFirst(ele);
					 break;
			case 4 : ele = sc.nextInt();
					 ll.addLast(ele);
					 break;
			case 5 : pos = sc.nextInt();
					 ele = sc.nextInt();
					 ll.add(pos, ele);
					 break;
			case 6 : Integer e = sc.nextInt();
					 ll.remove(e);
					 break;
			case 7 : pos = sc.nextInt();
					 ll.remove(pos);
					 break;
			case 8 : System.out.println(ll);
			break;
			case 9 : ele = sc.nextInt();
					 System.out.println(ll.contains(ele));
					 break;
			case 10 : ll.clear();
			break;
			}
		}

	}

}
