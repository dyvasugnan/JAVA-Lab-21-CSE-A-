package javalab;
import java.util.*;


public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>v=new Vector<Integer>();
		v.add(10);
		System.out.println("elements in vector : "+v);

		v.add(20);
		System.out.println("elements in vector : "+v);

		v.add(30);
		System.out.println("elements in vector : "+v);

		v.add(40);
		System.out.println("elements in vector : "+v);

		v.add(50);
		System.out.println("elements in vector : "+v);

		v.add(2,15);
		
		System.out.println("elements in vector : "+v);
		System.out.println("removing element at index 1 :"+v.remove(1));
		System.out.println("elements in vector : "+v);
		
		System.out.println("size of vector : "+v.size());
		System.out.println("capacity of vector : "+v.capacity());
		System.out.println("index of 30 : "+v.indexOf(30));
		System.out.println("does element 5 is in stack : "+v.contains(5));
		System.out.println("setting ele 10 at index 1: "+v.set(1, 10));
		System.out.println("elements in vector : "+v);

	}

}
