package javalab;
import java.util.*;
import java.lang.*;
public class DoublyLinkedList {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> dl = new LinkedList<Integer>();
	System.out.println("1.add 2.remove 3.display 4.exit ");
	

	while(true) {
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter an element:");
			int e = sc.nextInt();
			dl.add(e);
			break;
			
			
		case 2:
			int el= dl.removeFirst();
			System.out.println(el);
			break;
			
		case 3:
			Iterator it = dl.iterator();
			while(it.hasNext()) {
				System.out.print(it.next() +" ");
			}
			break;

			
		case 4:
			System.exit(0);
			default : System.out.println("The given element is not found");
		}
	}
	}
}
