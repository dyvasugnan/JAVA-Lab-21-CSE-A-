package javalab;
import java.util.*;
public class StackStruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ele,ch,x,p,s;
		Stack <Integer> st = new Stack <Integer>();
		while(true) {
			System.out.print("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Search\n6.Exit\n");
			System.out.print("Enter your choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.print("Enter elements to be inserted:");
					ele = sc.nextInt();
					st.push(ele);
					break;
					
			case 2:x = st.pop();
				System.out.print("Element to be popped out:"+x);
				break;
				
			case 3:p = st.peek();
			    System.out.print("Element at topmost: \n" +p);
			    break;
			
			case 4:System.out.print(st);
					break;
			case 5:
			System.out.print("Enter elements to  be searched\n");
			x = sc.nextInt();
			int y;
			boolean b =st.contains(x);
			if(b) {
				y=st.indexOf(x);
				System.out.print("Element found\n");
			}
			else
				System.out.print("Not Found\n");
			break;
					
			case 6: System.exit(0);
					break;
			}
		}
	}

}
