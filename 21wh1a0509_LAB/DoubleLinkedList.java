package javalab;
import java.util.*;
public class DoubleLinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LinkedList <Integer> dll = new LinkedList<Integer>();
		int ch,ele,pos;
		while(true){
			System.out.print("1.addFrirst\n2.addLast\n3.addat\n4.removeFirst\n5.removeLast\n6.remove\n7.size\n8.index\n9.print\n10.exit\n");
			System.out.print("Enter your choice");
			ch = sc.nextInt();
			switch(ch){
				case 1 :System.out.print("Enter an element to add first");
						ele=sc.nextInt();
						dll.addFirst(ele);
						break;
				case 2 :System.out.print("Enter element to add last");
						ele=sc.nextInt();
						dll.addLast(ele);
						break;
				case 3 :System.out.print("enter the element and position");
						ele = sc.nextInt();
						pos = sc.nextInt();
						dll.add(pos,ele);
						break;
				case 4 :int x = dll.removeFirst();
						System.out.print("The element removed is" + x);
						break;
				case 5 :int y = dll.removeLast();
						System.out.print("The element removed is " + y);
						break;
				case 6 :System.out.print("Enter element to be removed");
						ele = sc.nextInt();
						int r = dll.remove(ele);
						System.out.print("removed elemnt is" + r);
						break;
				case 7 :int s = dll.size();
						System.out.print("The size of linked list is" + s);
						break;
				case 8 :System.out.print("enter element to find index");
						ele = sc.nextInt();
						int ind = dll.indexOf(ele);
						System.out.print("The index of given element: "+ind);				
						break;
				case 9 :System.out.print(dll);
						break;
				case 10 :System.exit(0);
						break;
			}
		}
	}
}
