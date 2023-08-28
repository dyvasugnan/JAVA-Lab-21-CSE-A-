import java.util.*;

public class LinkedListImp {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your choice\n1.Insert\t2.Insert at end\t3.Insert at beginning\t4.Delete\t5.Delete at end\t6.Delete at beginning\t7.Find index\t8.Clear all\t9.Display\t10.Exit");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:{
                    System.out.println("Enter element to be inserted and its position: ");
                    int x = sc.nextInt();
                    int pos = sc.nextInt();
                    l.add(pos,x);
                }
                break;
                case 2:{
                    System.out.println("Enter element to be inserted: ");
                    int x = sc.nextInt();
                    l.addLast(x);
                }
                break;
                case 3:{
                    System.out.println("Enter element to be inserted: ");
                    int x = sc.nextInt();
                    l.addFirst(x);
                }
                break;
                case 4:{
                    System.out.println("Enter positon to be removed: ");
                    int pos = sc.nextInt();
                    System.out.println("Deleted element is: " + l.remove(pos));
                }
                break;
                case 5:{
                    System.out.println("Deleted element from end: " + l.removeLast());
                }
                break;
                case 6:{
                    System.out.println("Deleted element from beginning: " + l.removeFirst());
                }
                break;
                case 7:{
                    System.out.println("Enter element: ");
                    int x = sc.nextInt();
                    System.out.println("The index of "+x+" :" + l.indexOf(x));
                }
                break;
                case 8:{
                    l.clear();
                    System.out.println("List is cleared");
                }
                break;
                case 9:{
                    for(int i : l)
                    {
                        System.out.print(i + "   ");
                    }
                    System.out.println();
                }
                break;
                case 10:System.exit(0);
                default:System.out.println("Invalid input");
            }
        }
    }
}
