package javalab;
import java.util.Scanner;
public class MergeString {
	public static void main(String[] args) {
		String s1,s2;
	    char s3[]=new char[20];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string s1: ");
		s1 = sc.next();
		System.out.print("Enter string s2: ");
		s2 = sc.next();
		int l1 = s1.length();
		int l2 = s2.length();
		int j=0,i;
		for(i=0;i<l1&&i<l2;i++){
		  s3[j]=s1.charAt(i);
		  j++;
		  s3[j]=s2.charAt(i);
		  j++;
		}
		int pos=i;
		l1=l1-pos;
		l2=l2-pos;
		while(l1>0){
		   s3[j]=s1.charAt(pos);
		   pos++;
		   j++;
		   l1--;
		}
		while(l2>0){
		  s3[j]=s2.charAt(pos);
		  pos++;
		  j++;
		  l2--;
		}
		System.out.print(s3);
	}
}
		
