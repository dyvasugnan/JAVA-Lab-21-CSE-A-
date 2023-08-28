package javalab;
import java.util.*;
public class List {
	public static void main(String[] args) {
		int num,ch,ele,pos,x,y;
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer>ll = new LinkedList<Integer>();
		while(true) {
			System.out.print("1.Insert\n 2.Delete\n 3.Display\n 4.Search\n 5.count\n 6.Exit\n");
			System.out.print("Enter choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:System.out.print("Enter data: ");
			       ele = sc.nextInt();
			       ll.add(ele);
			       break;
			case 2:System.out.print("Enter position of the element: ");
				   pos = sc.nextInt();
				   //Integer obj = ll.remove(pos);
				   if(pos>=ll.size())
					   System.out.println("Index is out of bound");
				   else {
					   Integer obj = ll.remove(pos);
				      System.out.println("Deleted element: "+ obj);
				   }
				   break;
			case 3:System.out.println(ll);
			       break;
			case 4:System.out.print("Enter element you want to search: ");
			       x = sc.nextInt();
			       boolean b = ll.contains(x);
			       if(b) {
			    	    y = ll.indexOf(x);
			    	   System.out.println("Element exists at index "+ y);
			       }
			       else
			    	   System.out.println("Element does not exist");
			       break;
			case 5:int c = ll.size();
				   System.out.println("No.of nodes are "+ c);
				   break;
			case 6:System.exit(0);
			}
		}
	}
}
