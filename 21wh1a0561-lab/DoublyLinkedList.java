package javalab;
import java.util.*;
public class DoublyLinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
LinkedList<Integer> dl = new LinkedList<Integer>();
while(true) {
System.out.print("1. insert\n2. Remove\n3. display\n4. exit\n5. Enter your choice : ");
int ch = sc.nextInt();
int ele;
Integer key,i;
switch(ch) {
case 1:  System.out.printf("Enter the element to be inserted: ");
          ele = sc.nextInt();
          dl.push(ele);
          break;
case 2 : 	System.out.printf("Enter the element to be deleted : ");
			key = sc.nextInt();
			if(dl.contains(key))
				dl.remove(key);
			else 
				System.out.print("ele not found");
			break;
case 3 : System.out.printf("The elements are :");
			for(i = 0;i<dl.size();i++)
				System.out.print(dl.get(i)+" ");
			System.out.println();
			
			break;
case 4 : System.exit(0);
         break;
} }
}}