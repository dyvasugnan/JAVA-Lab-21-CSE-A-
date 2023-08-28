package Javalab;
import java.util.*;

public class DLLMenu {
	public static void main(String[] args) {
		LinkedList <Integer> dll = new LinkedList <> ();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1.Insert First\n2.Insert Last\n3.Delete\n4.Display\n5.Clear Linked List\n6.Exit");
			System.out.println("Enter choice:");
			int choice = sc.nextInt();
			switch(choice){
				case 1: int num = sc.nextInt();
						dll.addFirst(num);
						break;
				case 2: num = sc.nextInt();
						dll.addLast(num);
						break;
				case 3: num = sc.nextInt();
						dll.remove(num);
						break;
				case 4: for(int n: dll)
							System.out.print(n + " ");
						System.out.println(" ");
						break;
				case 5: dll.clear();
						System.out.println("DLL cleared.");
						break;
				case 6: System.exit(0);
						break;
				default: System.out.println("Invalid Input");
			}
		}
	}

}
