package javalab;
import java.util.*;

public class Strsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of strings : ");
		int n  =sc.nextInt();
		        String s [] = new String[n];
		        System.out.print("Enter strings: ");
		        for(int i=0;i<n;i++)
		        s[i] = sc.next();
		        for(int i = 0;i<n;i++){
		            for(int j = 0;j<n-i-1;j++){
		                if((s[j].compareTo(s[j+1]))>0){
		                    temp = s[j];
		                    s[j] = s[j+1];
		                    s[j+1] = temp;
		                }
		               
		            }
		        }
		        System.out.print("The sorted order is:  ");
		        for(int i = 0;i<n;i++)
		        System.out.print(s[i]+" ");
		       sc.close();
		    }
		}
	