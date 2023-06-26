import java.lang.*;
import java.util.*;
class Concatenate{
public static void main(String args[]){
String s1, s2, s3 = "";
int i = 0, j = 0, k = 0;
Scanner sc = new Scanner(System.in);
System.out.println("enter first string:");
s1 = sc.next();
System.out.println("enter second string:");
s2 = sc.next();
while(i < s1.length() && j < s2.length()){
s3 = s3 +  s1.charAt(i);
s3 = s3 +  s2.charAt(j);
i++;
j++;
}
while(i < s1.length()){
s3 = s3 + s1.charAt(i);
i++;
}
while(j < s2.length()){
s3 = s3 + s2.charAt(j);
j++;
}
System.out.println("string :" + s3);
}
}
