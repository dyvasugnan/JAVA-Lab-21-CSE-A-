package Javalab;
import java.util.*;

public class DoubleLinkedList {

	public static void main(String[] args) {
		LinkedList <Integer> dll = new LinkedList<>();
		dll.addFirst(3);
		dll.addFirst(5);
		dll.addLast(6);
		dll.addLast(7);
		dll.add(2,4);
		System.out.println("Elements added");
		for(int num: dll)
			System.out.print(num + " ");
		System.out.println(" ");
		dll.remove(3);
		dll.remove(1);
		System.out.println("Elements deleted");
		for(int num: dll)
			System.out.print(num + " ");
		System.out.println(" ");
		dll.clear();
		System.out.println("Linked List cleared.");
		for(int num: dll)
			System.out.print(num + " ");
	}

}
