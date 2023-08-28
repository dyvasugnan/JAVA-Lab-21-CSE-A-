package javalab;
import java.util.*;
public class DemoStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack <String> st = new Stack <String>();
		int ch;
		//st
		while(true) {
			System.out.print("\n1.insert\n2.delete\n3.display\n4.search\n5.is empty\n6.clear stack\n7.peek\n8.exit\nEnter you choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: String s = sc.next();
					st.add(s);
					break;
			case 2: s = sc.next();
					st.remove(s);
					break;
			case 3: st.forEach((se) -> System.out.println(se));
			break;
			case 4: s = sc.next();
					System.out.println(st.contains(s));
					break;
			case 5: System.out.println(st.empty());
			break;
			case 6:st.clear();
			break;
			case 7: System.out.println(st.peek());
			break;
			case 8: System.exit(0);
			}
		}
	}

}
