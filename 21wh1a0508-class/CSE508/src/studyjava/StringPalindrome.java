package studyjava;
import java.lang.*;
import java.io.*;

public class StringPalindrome{
	public static void main(String args[])throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine(), reverseStr = "";
		System.out.print(str);
			    int strLength = str.length();

			    for (int i = (strLength - 1); i >=0; --i) {
			      reverseStr = reverseStr + str.charAt(i);
			    }

			    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			      System.out.println(" is a Palindrome String.");
			    }
			    else {
			      System.out.println(" is not a Palindrome String.");
			    }
			  

	}

}
