import java.lang.*;

import java.util.*;

public class HashTable {

       public static void main(String args[]) {

    	   Scanner sc = new Scanner(System.in);

    	   Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();

    	   while(true) {

    		   System.out.println("1.Put\t2.Get\t3.Remove\t4.Display\t5.Exit");

    		   System.out.println("Enter your choice:");

    		   int ch = sc.nextInt();

    		   switch(ch) {

    		   case 1:

    			   System.out.println("Enter key and value: ");

    			   int k = sc.nextInt();

    			   int v = sc.nextInt();

    			   ht.put(k, v);

    			   break;

    		   case 2:

    			   System.out.println("Value of key: ");

    			   int key = sc.nextInt();

    			   System.out.println(ht.get(key));

    			   break;

    		   case 3:

    			   System.out.println("Remove key: ");

    			   int keyr = sc.nextInt();

    			   ht.remove(keyr);

    			   break;

    		   case 4:

    			   System.out.println(ht);

    			   break;

    		   case 5:

    			   System.exit(0);

    		   }

    	   }

       }

}
