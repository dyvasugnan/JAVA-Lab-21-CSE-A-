

import java.util.*;

public class DoubleLinkedList {
	
	public static void main(String args[]) {
		
		LinkedList<Integer> ll =new LinkedList<Integer>();
				
		System.out.print("1 for insert front\n2 for insert end\n3 for delete front\n4 for delete end\n5 for delete pos\n6 for search\n7 for display\n8 for replace\n9 for clear\n10 for exit\n");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter your choice : ");
			int ch= sc.nextInt();
			int ele;
			switch(ch) {
			
			case 1 :System.out.print("Enter ele : ");
						ele = sc.nextInt();
						ll.addFirst(ele);	
						break;
				
			case 2 :System.out.print("Enter ele : ");
					ele = sc.nextInt();
					ll.addLast(ele);
					break;
					
			case 3:if(!(ll.isEmpty())) {
					ele = ll.removeFirst();
					System.out.println("deleted element is : "+ele);
					}
					else {
						System.out.println("List is empty");
					}
						break;
					
			case 4 :if(!(ll.isEmpty())) { 
					ele = ll.removeLast();
					System.out.println("deleted element is : "+ele);
					}
					else {
						System.out.println("List is empty");
					}
						break;
					
			case 5 : System.out.print("Enter position : ");
					int pos=sc.nextInt();
					 if(!(ll.isEmpty())) {						
						ele = ll.remove(pos);
						System.out.println("deleted element is : "+ele);	
					 }
					 else {
						 System.out.println("List is empty");
					 }
						break;
						
			case 6 : System.out.print("enter ele to be searched : ");
						ele = sc.nextInt();
						if(!(ll.isEmpty())) {
							int i=ll.indexOf(ele);
							if(i!=-1)
							System.out.println(ele+" is found at pos : "+i);
							else
							System.out.println("not found");
						}
						else {
							System.out.println("List is empty");
						}
						break;
			case 7 :// System.out.println(ll);
					Iterator it = ll.iterator();
					while(it.hasNext()) {
						System.out.print(it.next()+" ");
					}
					System.out.println();
					break;
			case 8 : System.out.print("Enter position : ");
					int po=sc.nextInt();
					System.out.print("Enter element : ");
					ele = sc.nextInt();
					 if(!(ll.isEmpty())) {						
						ll.set(po, ele);
					 }
					 else {
						 System.out.println("List is empty");
					 }
					break;
			case 9 : ll.clear(); 
						break;
			case 10 : System.exit(0);
			} 
		}
	}
}
