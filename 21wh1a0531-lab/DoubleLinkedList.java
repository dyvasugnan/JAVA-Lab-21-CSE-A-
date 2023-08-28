package javaclass;
import java.util.*;
import java.lang.*;
public class DoubleLinkedList {
	public static void main(String args[]) {
		int ch,ele,pos;
		Scanner sc = new Scanner(System.in);
		LinkedList <Integer> ll = new LinkedList<Integer>(); 
		while(true) {
			System.out.println("1.addFirst\n2.addLast\n3.addposition\n4.remove\n5.removefirst\n6.removelast\n7display\n8.size\n9.index\n10.exit");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch(ch) {
				case 1 : System.out.println("enter element:");
						 ele = sc.nextInt();
						 ll.addFirst(ele);
						 break;
				case 2 : System.out.println("enter element:");
						 ele = sc.nextInt();
						 ll.addLast(ele);
						 break;
				case 3 : System.out.println("enter position and element:");
						 pos = sc.nextInt();
						 ele = sc.nextInt();
						 ll.add(pos,ele);
						 break;
				case 4 : System.out.println("enter position to remove:");
						 pos = sc.nextInt(); 
						 int r2 = ll.remove(pos);
						 System.out.println(r2);
						 break;
				case 5 : int r = ll.removeFirst();
						 System.out.println(r);
						 break;
				case 6 : int r1 = ll.removeLast();
						 System.out.println(r1);
						 break;
				case 7 : System.out.println(ll);
				case 8 : int s = ll.size();
						 System.out.println(s);
						 break;
				case 9 : System.out.println("Enter element:");
						 int o = sc.nextInt();
					     int i = ll.indexOf(o);
					     System.out.println(i);
					     break;
				case 10 : System.exit(0);
						 break;
			}
		}
	}
}
