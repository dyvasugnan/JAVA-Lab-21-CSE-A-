import java.util.*;
public class DoublyLL{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer>ll = new LinkedList<Integer>();
	System.out.print("1.add\n 2.delete\n 3.display\n");
	
	while(true) {
		int ch = sc.nextInt();
		switch(ch) {
		case 1:System.out.print("enter the element");
		int ele = sc.nextInt();
		ll.add(ele);
		break;
		
		case 2:int e = ll.removeFirst();
		System.out.print(e);
		break;
		
		case 3:Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		break;
		 
		case 4 : System.exit(0);
		}
	}
}
}