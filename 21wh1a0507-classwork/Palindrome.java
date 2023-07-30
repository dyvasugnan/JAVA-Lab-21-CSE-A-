package java_codes;
import java.util.*;
public class Palindrome {
	 public static void main(String[] args) {      
	        System.out.println("enter a string ");
	        Scanner sc = new Scanner(System.in);
	        String s;
	        s = sc.next();
	        int temp =0;
	        for(int i=0;i<s.length();i++){
	        	if(s.charAt(i)!=s.charAt(s.length()-i-1)){
	        		temp =1 ;
	        		break;
	        		}
	        }
	        if(temp == 1 )
	        	System.out.println(s+" "+"is not a not palindrome");
	        else
	        	System.out.println(s+" "+"is a palindrome");
	        }
}
