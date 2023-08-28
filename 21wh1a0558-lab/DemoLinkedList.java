package javalab;
import java.util.*;
public class DemoLinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		LinkedList<Integer>ll = new LinkedList<Integer>();
		ll.add(10);
		//ll.add(sc.nextInt());
		ll.addFirst(20);
		System.out.println(ll);
		Scanner sc = new Scanner(System.in);
		System.out.println("Add 3 Elements into Linked List: ");//30,40,50
		ll.add(sc.nextInt());
		ll.addFirst(sc.nextInt());
		ll.addLast(sc.nextInt());
		System.out.println(ll);
		ll.removeFirst();
		System.out.println("removes first");
		System.out.println(ll);
		System.out.println("Adding 20 at position 2");
		ll.add(2,20);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println("removes first element");
		System.out.println(ll);
		ll.removeLast();
		System.out.println("removes Last element");
		System.out.println(ll);
		System.out.println("adding 40 and 50");
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		System.out.println("removing element at position 3");
		ll.remove(3);
		System.out.println(ll);
		System.out.println("the size of linked list is : "+ll.size());
		System.out.println("the index of element 20 is : " +ll.indexOf(20));
		
	}

}
