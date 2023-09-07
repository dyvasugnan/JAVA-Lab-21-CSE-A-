package javagui3;

import java.util.*;

public class StackDemo {
	public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements u want to insert into stack:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
        	System.out.println("Enter element into stack:");
        	int ele = sc.nextInt();
        s.push(ele);
        }
        System.out.println("Stack elements:");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
	}
}
