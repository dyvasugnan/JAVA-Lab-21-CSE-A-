package javalab;
import java.util.*;
public class stack {
	public static void main(String args[]) {
	int num,ch,ele,pos,x,y;
	Scanner sc = new Scanner(System.in);
	Stack<Integer>s = new Stack<Integer>();
	while(true) {
		System.out.print("1.Insert\n 2.Delete\n 3.Display\n 4.Search\n 5.count\n 6.peek\n 7.Exit\n");
		System.out.print("Enter choice: ");
		ch = sc.nextInt();
		switch(ch) {
		case 1:System.out.print("Enter data: ");
		       ele = sc.nextInt();
		       s.push(ele);
		       break;
		case 2:x = s.pop();
			   System.out.println("Deleted element is "+ x);
			   break;
		case 3:System.out.println(s);
		       break;
		case 4:System.out.print("Enter element you want to search: ");
		       x = sc.nextInt();
		       boolean b = s.contains(x);
		       if(b) {
		    	    y = s.indexOf(x);
		    	   System.out.println("Element exists at index "+ y);
		       }
		       else
		    	   System.out.println("Element does not exist");
		       break;
		case 5:int c = s.size();
			   System.out.println("No.of nodes are "+ c);
			   break;
		case 6:num = s.peek();
				System.out.println("Peek element is "+ num);
				break;
		case 7:System.exit(0);
		}
	}
	}
}
