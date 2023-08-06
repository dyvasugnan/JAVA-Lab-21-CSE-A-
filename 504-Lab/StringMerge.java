package moulikaLab;

import java.util.Scanner;

public class StringMerge{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one string: ");
		String s1 = sc.next();
		System.out.println("Enter Second string: ");
		String s2 = sc.next();
		StringBuilder res_string = new StringBuilder(); 
		int l1 = s1.length();
		int l2 = s2.length();
		int i=0, j=0;
		while(i<l1 && j<l2) {
			res_string.append(s1.charAt(i++));
			res_string.append(s2.charAt(j++));
		}
		while(i<l1) {
			res_string.append(s1.charAt(i++));
		}
		while(j<l2) {
			res_string.append(s2.charAt(j++));
		}
		
		System.out.println("Resultant String is: "+res_string);
		
	}
}