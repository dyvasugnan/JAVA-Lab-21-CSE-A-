package javalab;
import java.util.LinkedList;
import java.util.Scanner;
public abstract class DoubleLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer>doublyLinkedList = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int ch;
		while(true) {
            System.out.println("\n1.insert\n2.delete\n3.display");
			System.out.println("enter your choice:");
			ch =  sc.nextInt();
			switch(ch) {
			case 1 : System.out.println("enter the element to be inserted:");
			         int value = sc.nextInt();
			         doublyLinkedList.add(value);
			         break;
            case 2 : System.out.println("enter the element to be deleted:");
                     int ele = sc.nextInt();
			         System.out.println("Deleted element:" + doublyLinkedList.remove(ele));			         	
			         break;
            case 3 : System.out.println(doublyLinkedList);

			         break;
			case 4 : System.exit(0);

			default : System.out.println("Invalid choice:");

			}

		}

	}

}
