package javalab;

import java.util.*;

public class LinkedL {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		while(true) {

		System.out.println("1)Insert\n2)Delete\n3)Display\n4)exit");

		int op = sc.nextInt();

		switch(op) {

			case 1:

			//insert

			System.out.println("Enter the number: ");

			int ob = sc.nextInt();

			ll.add(ob);

			break;

			

			case 3:

			//display

			System.out.println("THe elements in linked");

			for(int i: ll) {

				System.out.print(i+" ");

			}

			break;

			

			case 2:

			//delete

			System.out.println("Insert the position of element you want to delete: ");

			int b = sc.nextInt();

			int s = ll.size();

			if(s>=b) {

				int c = ll.remove(b);

				System.out.println("Removed element is: "+c);

			}

			else {

				System.out.println("Out of bounds");

			}

			break;

			

			case 4:

				System.exit(0);

				break;

		}

		/*int a = sc.nextInt();

		while(true) {

			switch(a) {

			case

			}

		}*/

		}

	}



	

}