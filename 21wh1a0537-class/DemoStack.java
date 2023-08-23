package javalab;
import java.util.*;

public class DemoStack {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
		    System.out.println("1.push 2.pop 3.peek 4.display 5.check empty 6.exit");
			int n=sc.nextInt();
			if(n==1) {
				int x;
				System.out.print("enter ele to push ");
				x=sc.nextInt();
				st.push(x);
			}
			else if(n==2) {
				Integer ele =st.pop();
				System.out.println("poped ele : "+ele );
			}
			else if(n==3) {
				Integer ele =st.peek();
				System.out.println("top ele is : "+ele);
			}
			else if(n==4) {
				System.out.println(st);
			}
			else if(n==5) {
				if(st.empty()) {
					System.out.println("stack is empty");
				}
				else System.out.println("stack is not empty ");
			}
			else if (n==6) System.exit(0);
		}
		
		

	}

}
