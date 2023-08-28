package classprograms;

import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int ch, ele, pos;

        while (true) {
            System.out.println("1. Add \n2. Add at first\n3. Add at last\n4. Add at position\n5. Remove element\n6. Remove at position\n7. Print\n8. Search\n9. Clear\n10. Exit\nEnter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ele = sc.nextInt();
                    al.add(ele);
                    break;
                case 2:
                    ele = sc.nextInt();
                    al.add(0, ele);
                    break;
                case 3:
                    ele = sc.nextInt();
                    al.add(ele);
                    break;
                case 4:
                    pos = sc.nextInt();
                    ele = sc.nextInt();
                    al.add(pos, ele);
                    break;
                case 5:
                    ele = sc.nextInt();
                    al.remove(Integer.valueOf(ele));
                    break;
                case 6:
                    pos = sc.nextInt();
                    al.remove(pos);
                    break;
                case 7:
                    System.out.println(al);
                    break;
                case 8:
                    ele = sc.nextInt();
                    System.out.println(al.contains(ele));
                    break;
                case 9:
                    al.clear();
                    break;
                case 10:
                    System.exit(0);
                    break;
            }
        }
    }
}
