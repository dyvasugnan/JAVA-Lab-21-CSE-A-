import java.util.*;
public class DllMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> dll = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("1)Insertion First\n2)Insert Last\n3)Delete\n4)Display\n5)Clear\n6)Exit\n");
		int choice = sc.nextInt();
		int n;
			switch(choice) {
				case 1:  n = sc.nextInt();
					dll.addFirst(n);
				break;
				case 2:  n = sc.nextInt();
					dll.addLast(n);
				break;
				case 3: n = sc.nextInt();
					dll.remove(n);
				break;
				case 4: for(int num : dll) {
					System.out.print(num +" ");
					System.out.println();
				}
				break;
				case 5: dll.clear();
				System.out.print("Linked list cleared\n");
				break;
				case 6: System.exit(0);
			}
		}
	}
}
