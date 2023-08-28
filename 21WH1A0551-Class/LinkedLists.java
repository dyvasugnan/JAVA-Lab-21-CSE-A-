package classprograms;

import java.util.*;

public class LinkedLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        int ch, ele, pos;

        while (true) {
            System.out.println("1. Add \n2. Add at first\n3. Add at last\n4. Add at position\n5. Remove element\n6. Remove at position\n7. Print\n8. Search\n9. Clear \n10. Exit\nEnter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ele = sc.nextInt();
                    ll.add(ele);
                    break;
                case 2:
                    ele = sc.nextInt();
                    ll.addFirst(ele);
                    break;
                case 3:
                    ele = sc.nextInt();
                    ll.addLast(ele);
                    break;
                case 4:
                    pos = sc.nextInt();
                    ele = sc.nextInt();
                    ll.add(pos, ele);
                    break;
                case 5:
                    ele = sc.nextInt();
                    ll.remove(Integer.valueOf(ele));
                    break;
                case 6:
                    pos = sc.nextInt();
                    ll.remove(pos);
                    break;
                case 7:
                    System.out.println(ll);
                    break;
                case 8:
                    ele = sc.nextInt();
                    System.out.println(ll.contains(ele));
                    break;
                case 9:
                    ll.clear();
                    break;
                case 10:
                    System.exit(0);
                    break;
            }
        }
    }
}
