import java.util.*;
import java.io.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.next();
        StringBuilder sb=new StringBuilder(s1);  
        sb.reverse();
        String s2 = sb.toString();  
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}