import java.lang.*;

import java.util.*;

public class Dll {

       public static void main(String args[]) {

    	   LinkedList <Integer> ll = new LinkedList<>();

    	   Scanner sc = new Scanner(System.in);

    	   while(true) {

    		   System.out.println("1.Insert Front\t2.Insert End\t3.Delete Front\t4.Delete End\t5.Display\t6.Remove at position\t7.Index of element\t8.Size\t9.Exit\t");

    	   System.out.print("Enter your choice: ");

    	   int ch = sc.nextInt();

    	   switch(ch) {

    	   case 1:

    		   System.out.print("Enter value to be inserted:");

    		   int val = sc.nextInt();

    		   ll.addFirst(val);

    		   break;

    	   case 2:

    		   System.out.print("Enter value to be inserted at last:");

    		   int ans = sc.nextInt();

    		   ll.addLast(ans);

    		   break;

    	   case 3:

    		   ll.removeFirst();

    		   break;

    	   case 4:

    		   ll.removeLast();

    	       break;

    	   case 5:

    		   System.out.println(ll);

    		   break;

    	   case 6:

    		   System.out.println("Enter the position at which element is to be deleted:");

    		   int pos = sc.nextInt();

    		   ll.remove(pos);

    		   break;

    	   case 7:

    		   System.out.println("Enter the element:");

    		   int ele = sc.nextInt();

    		   System.out.println(ll.indexOf(ele));

    		   break;

    	   case 8:

    		   System.out.println("Size of linked list is:"+ll.size());

    		   break;

    	   case 9:

    		   System.exit(0);

      }

    }

}

}
