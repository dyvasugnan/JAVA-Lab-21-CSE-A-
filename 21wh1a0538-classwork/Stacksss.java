package javalab;
import java.util.*;
import java.io.*;
public class Stacksss {
public static void main(String args[]) {
		Stack<Integer> st = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int ch ;
		while(true) {
		System.out.println("1. push\n2. pop\n3. peek\n4. search\n5. exit\n");
		System.out.print("Enter your choice");
		ch = sc.nextInt();
		int ele;
		int key;
		switch(ch) {
		case 1 : System.out.printf("Enter the element to inserted : ");
		          ele = sc.nextInt();
		          st.push(ele);
		          break;
		case 2  : System.out.printf("The element poped is : "+st.pop() );
		          break;
		case 3 : System.out.printf("The peek element is : "+st.peek());
			      break;
		case 4 : System.out.printf("Enter the element to be searche : ");
		         key = sc.nextInt();
		         if(st.search(key)==-1)
		        	 System.out.print("Element not found");
		         else 
		        	 System.out.println(st.search(key));
		         break;
		case 5 :System.out.print(st);
		            break;
		case 6 : System.exit(0);
		            break;
					
		}}
}
}
