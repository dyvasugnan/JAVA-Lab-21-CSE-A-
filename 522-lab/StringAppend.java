package javaclass;
import java.lang.*;
import java.util.*;
class StringAppend{
public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter string1");
String s1 = sc.nextLine();
System.out.print("Enter string1");
String s2 = sc.nextLine();
if(s1.length()>s2.length()){
for(int i=0;i<s1.length();i++){
System.out.print(s1.charAt(i));
System.out.print(s2.charAt(i));
}
for(int j=s2.length();j<s1.length();j++){
System.out.print(s1.charAt(j));
}
}
if(s1.length()<s2.length()){
for(int i=0;i<s1.length();i++){
System.out.print(s1.charAt(i));
System.out.print(s2.charAt(i));
}
for(int j=s1.length();j<s2.length();j++){
System.out.print(s2.charAt(j));
}
}

}
}