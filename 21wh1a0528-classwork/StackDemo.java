package varshini;

import java.util.*;

public class StackDemo {
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.print("1 for push\n2 for pop\n3 for peek\n4 for search\n5 to check stack\n6 to display\n7 for exit\n" );
		Scanner sc = new Scanner(System.in);
		Integer ele;
		while(true) {
			System.out.print("Enter your choice : ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1 : System.out.print("Enter element : ");
						 ele = sc.nextInt();
						st.push(ele);
						break;
			case 2 : if(! st.empty()) {
						ele = st.pop();
						System.out.println("Deleted element is : "+ele);
					 }
					 else {
						System.out.println("Stack is empty");	
					 }
					break;
			case 3 : if(! st.empty()) {
						ele = st.peek();
						System.out.println("Peek element is : "+ele);
					 }
					 else {
						System.out.println("Stack is empty");	
					 }
					break;
			case 4 : if(! st.empty()) {
					System.out.println("Enter element to be searched : ");
					ele = sc.nextInt();
					int s = st.search(ele);
					if(s==-1) {
						System.out.println("Element not found");
					}
					else {
						System.out.println("Element found at position : "+s);
					}
					 }
					 else {
						System.out.println("Stack is empty");	
					 }
					break;
					
			case 5 : if(st.empty())
					 System.out.println("Stsck is Empty");
					 else
					 System.out.println("Stack is Not Empty");
					 break;
					 
			case 6 : //System.out.println(st);
					Iterator it = st.iterator();
					while(it.hasNext()) {
						System.out.print(it.next()+" ");
					}
					System.out.println();
					 break;
					 
			case 7 : System.exit(0);
			}
			
		}
	}
}
