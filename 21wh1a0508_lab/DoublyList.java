package javaLab;
import java.util.*;

public class DoublyList {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer>Lis = new LinkedList<Integer>();
	System.out.print("1.add 2.delete 3.display");
	
	while(true) {
		int ch = sc.nextInt();
		switch(ch) {
		case 1:System.out.print("enter the element to be pushed");
		int ele = sc.nextInt();
		Lis.add(ele);
		break;
		
		case 2:int e = Lis.removeFirst();
		System.out.print(e);
		break;
		
		case 3:Iterator it = Lis.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		break;
		 
		case 4 : System.exit(0);
		
		default : System.out.print("element not found");
		}
	}
}
}
