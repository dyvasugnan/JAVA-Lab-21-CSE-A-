import java.util.*;
public class LList {
public static void main(String[] args) {
	LinkedList<Integer>ll=new LinkedList<Integer>();
	Scanner sc=new Scanner(System.in);
	
	while(true) {
	int ch;
	System.out.println("\n1.Insert 2.Delete 3.Display 4.Search 5.Exit \n" );
	System.out.print("Enter your choice : " );
	ch=sc.nextInt();
	switch(ch) {
	case 1:System.out.print("Enter Element to List: " );
			int ele=sc.nextInt();
			ll.add(ele);
			break;
	case 2:System.out.print("Enter Position to be delete : " );
			int x=sc.nextInt();
			Integer obj=ll.remove(x);
			System.out.print("Deleted Element : "+obj);
			break;
	case 3:System.out.print("Elements in the list : \n"+ll );
			
			break;
	case 4:System.out.print("Enter Element to be Search : " );
			int s=sc.nextInt();
			int y;
			boolean b=ll.contains(s);
			
			if(b) {
				y=ll.indexOf(s);
			
				System.out.print("Element Found at Index: "+y );
			}
			else
				System.out.print("Not Found !!" );
			break;
	case 5:System.exit(0);
			break;
	}
	}
}
}
