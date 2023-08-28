package csea504;

import java.util.*;

public class DoubleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> dll = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice:\n1.Insert\t2.Delete\t3.Display\t4.Exit");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:{
					System.out.println("Enter element to be inserted: ");
					int x = sc.nextInt();
					dll.add(x);
				}
				break;
				case 2:{
					try {
						System.out.println("Enter posistion to be deleted");
						int pos = sc.nextInt();
						System.out.println("Deleted element: " + dll.remove(pos));
					}
					catch(IndexOutOfBoundsException ie)
					{
						System.out.println("Enter valid position");
					}
				}
				break;
				case 3:{
					System.out.println(dll);
				}
				break;
				case 4: System.exit(0);
				default:System.out.println("Invalid input");
			}
		}

	}

}
