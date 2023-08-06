package moulikaLab;

import java.io.*;
import java.lang.*;
import java.util.*;

public class ChotaBheemLaddu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		Set <Integer> hash_set = new HashSet<Integer>();
		for(int i=0; i<n; i++){
			int r = sc.nextInt();
			hash_set.add(r);
		}
		int m=n/2;
		int q = hash_set.size();
		if(q>=m) {
			System.out.println("no.of Laddus: "+m);
		}
		else {
			System.out.println("No.of Laddus: "+q);
		}
	}

}
