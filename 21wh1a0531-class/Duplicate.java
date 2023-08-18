package javaclass;
import java.util.*;
import java.lang.*;
public class Duplicate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.next();
		int c;
		char s1[] = s.toCharArray(); //converts string s to array
		for(int i=0;i<s.length();i++) {
			c=1;
			for(int j=i+1;j<s.length();j++) {
				if(s1[i]==s1[j] && s1[i] != ' ') {
					c++;
					s1[j]='0';
				}
			}
			if(c>0 && s1[i]!='0') {
				System.out.print(s1[i]);
			}
		}
	}

}
