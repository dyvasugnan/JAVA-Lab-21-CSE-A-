package javalab;
import java.util.*;
public class AllCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList:An ordered collection that allows duplicate elements.
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		System.out.println(list);     //[Hello, World]
				
		//LinkedList:A doubly-linked list implementation of the List interface.
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		System.out.println(linkedList);    //[1, 2]

		
		//HashSet:An unordered collection that does not allow duplicate elements.
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		System.out.println(set);    //[Apple, Banana]

		
		//HashMap:A collection that stores key-value pairs.
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 25);
		map.put("Bob", 30);
		System.out.println(map);    //{Bob=30, Alice=25}
		
		
		//TreeSet:A sorted set that stores elements in natural order or by a specified comparator.
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(5);
		treeSet.add(2);
		System.out.println(treeSet);   //[2, 5]
		
		
		//A sorted map that stores key-value pairs in natural order or by a specified comparator.
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("John", 28);
		treeMap.put("Sarah", 24);
		System.out.println(treeMap);        //{John=28, Sarah=24}
		
		
		//An interface for queues, with implementations like LinkedList and PriorityQueue.
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		System.out.println(queue);   //[1, 2]
		
		
		//An interface for stacks, with implementations like LinkedList.
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(4);
		System.out.println(stack);   //[3, 4]

		
	}

}
