package java_lab;
import java.util.*;
public class DoubleLinkedList {
		public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);
			LinkedList<Integer>dll=new LinkedList<Integer>();
			while(true) {
				System.out.println("1.add 2.remove 3.display 4.exit");
				System.out.print("enter your choice: ");
				int ch=sc.nextInt();
				int ele;
				Integer key,i;
				switch(ch) {
				case 1 :
					System.out.println("enter element to be inserted: ");
					ele=sc.nextInt();
					dll.push(ele);
					break;
				case 2:System.out.println("eneter elemnet to be removed: ");
				key=sc.nextInt();
				if(dll.contains(key))
				dll.remove(key);
				else
					System.out.println("element not found: ");
				break;
				case 3:
					System.out.println("elements are: ");
					for(i=0;i<dll.size();i++)
						System.out.println(dll.get(i)+" ");
					System.out.println();
	                break;	
				case 4: System.exit(0); 
				break;
				}
				
			}
		}

}


