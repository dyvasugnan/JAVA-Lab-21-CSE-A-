package javagui3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Arraylist Implementation:");
			System.out.println("1.add ele");
			System.out.println("2.insert in between elements");
			System.out.println("3.remove ele");
			System.out.println("4.set  ele at particular index");
			System.out.println("5.size");
			System.out.println("6.loops");
			System.out.println("7.sorting list");
			System.out.println("8.print arraylist");
			System.out.println("9.exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			int ele,i;
			switch(ch) {
			case 1:
				System.out.println("Enter element to add:");
				 ele = sc.nextInt();
				al.add(ele);
				break;
			case 2:
				System.out.println("Enter index and element to add in between:");
				i = sc.nextInt();
				ele = sc.nextInt();
				al.add(i,ele);
				break;
			case 3:
				System.out.println("Enter index:");
				i = sc.nextInt();
				al.remove(i);
				System.out.println("element at " + i + " is removed");
			case 4 :
				System.out.println("Enter index and element to set:");
				i = sc.nextInt();
				ele = sc.nextInt();
				al.set(i,ele);
				break;
			case 5:
				int s = al.size();
				System.out.print("Size:" + s);
				break;
			case 6:
			System.out.println("Applying loops on Arraylist elements:");
			for(int j=0;j<al.size();j++) {
				System.out.println(al.get(j));
			}
			break;
			case 7:
				System.out.println("Sorting ");
				Collections.sort(al);
				System.out.println(al);
				break;
			case 8:
				System.out.println("Display");
				System.out.println(al);
			case 9:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid input!!!");
				break;
			}
		}while(true);
	}
}
