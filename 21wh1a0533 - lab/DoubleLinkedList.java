import java.util.*;
public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> dll = new LinkedList<>();
		dll.addFirst(3);
		dll.addFirst(5);
		dll.addFirst(6);
		dll.addLast(4);
		dll.addLast(2);
		System.out.print("Elements added: ");
		for(int num : dll) {
			System.out.print(num +" ");
		}
		System.out.println();
		System.out.print("After removing elements: ");
		dll.remove(1);
		dll.remove(3);
		for(int num : dll) {
			System.out.print(num +" ");
		}
		System.out.println();
		System.out.print("Linked list cleared");
		dll.clear();
	}

}