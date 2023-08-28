import java.util.*;
public class StackStruct {
public static void main(String[] args) {
	Stack<Integer>st=new Stack<Integer>();
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.print("\n1.Push 2.Pop 3.Peek 4.Display 5.Search 6.Exit \n");
		System.out.print("Enter your choice : \n");
		int ch=sc.nextInt();
	switch(ch) {
	case 1:System.out.print("Enter element to Stack : ");
			int ele=sc.nextInt();
			st.push(ele);
			break;
	case 2: int x=st.pop();
			System.out.print("Element to be poped out : "+x);
			break;
	case 3:int y=st.peek();
		   System.out.print("Peek element : "+y);
		   break;
	case 4:System.out.print("Elements in Stack : "+st);
			break;
	case 5:System.out.print("Element to be search : ");
			int s=sc.nextInt();
		    boolean b=st.contains(s);
			if(b) {
				int f=st.indexOf(s);
				System.out.print("element found at : "+f);
			}
			else
				System.out.print("Not Found!!");
			break;
	case 6:System.exit(0);
			break;
	}
	}
}
}
