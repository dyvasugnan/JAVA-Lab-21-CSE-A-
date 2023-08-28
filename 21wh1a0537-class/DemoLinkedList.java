package javalab;
import java.util.*;
import java.io.*;
public class DemoLinkedList  {

public static void main(String[] args) {
LinkedList<Integer>ll=new LinkedList<Integer>();

ll.addFirst(10);
ll.addLast(100);

System.out.println(ll);
Scanner sc=new Scanner(System.in);
int x,y,z;

System.out.print("enter 3 nums to insert into ll: ");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
ll.add(x);
ll.add(y);
ll.add(z);
ll.add(sc.nextInt());

System.out.println(ll);

int ele=ll.remove(1);//remove(pos)
System.out.println("removed index one element");
System.out.println(ll);

System.out.println("removed first element");
ele=ll.removeFirst();//removed first element of ll
System.out.println(ll);

System.out.println("removed index last element ");
ele=ll.removeLast();
System.out.println(ll);

ele =ll.get(2);
System.out.println("element at 2nd index is : "+ele);
ll.set(2, 35);//replaced at index to to 35
System.out.println("replaced ele at index 2 : ");
System.out.println(ll);

System.out.println("Size of ll :"+ll.size());
System.out.println("first occurence of ele 2: "+ll.indexOf(2));
System.out.println("last occurence of ele 3:"+ll.lastIndexOf(3));


}

}
