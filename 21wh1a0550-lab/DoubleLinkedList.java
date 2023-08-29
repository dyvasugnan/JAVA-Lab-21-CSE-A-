package javalab;

import java.util.*;

public class DoubleLinkedList {

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Insert Front\t2.Insert End\t3.Delete Front\t4.Delete End\t5.Display\t6.Remove at position\t7.Index of element\t8.Size\t9.Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to be inserted at front: ");
                    int ele = sc.nextInt();
                    ll.addFirst(ele);
                    break;
                case 2:
                    System.out.print("Enter value to be inserted at last: ");
                    int val = sc.nextInt();
                    ll.addLast(val);
                    break;
                case 3:
                    if (!ll.isEmpty()) {
                        ll.removeFirst();
                    } else {
                        System.out.println("Linked list is empty.");
                    }
                    break;
                case 4:
                    if (!ll.isEmpty()) {
                        ll.removeLast();
                    } else {
                        System.out.println("Linked list is empty.");
                    }
                    break;
                case 5:
                    System.out.println("Linked List: " + ll);
                    break;
                case 6:
                    System.out.print("Enter the position to remove: ");
                    int pos = sc.nextInt();
                    if (pos >= 0 && pos < ll.size()) {
                        ll.remove(pos);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 7:
                    System.out.print("Enter the element: ");
                    int ans = sc.nextInt();
                    System.out.println("Index of element: " + ll.indexOf(ans));
                    break;
                case 8:
                    System.out.println("Size of linked list is: " + ll.size());
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
