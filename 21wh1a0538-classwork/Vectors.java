package javalab;
import java.util.*;
import java.io.*;
public class Vectors {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Vector<Integer> v = new Vector<Integer>();
//	System.out.print("Enter the element to be inserted : ");
	v.add(5);
	v.add(6);
	v.add(7);
	v.add(8);
	v.add(5);
	v.add(9);
	v.add(10);
	System.out.print("The elements in the vector are : ");
	System.out.print(v);
	System.out.print("Enter the element to be removed : ");
	Integer key  = sc.nextInt();
	v.remove(key);
	System.out.println("The size is "+v.size());
	System.out.println("The capacity is "+v.capacity());
	System.out.println("Enter the element to get index : ");
	key = sc.nextInt();
	System.out.println("The index is "+v.indexOf(key));
	System.out.println("The last index is "+v.lastIndexOf(key));
	
}
}
