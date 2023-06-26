import java.lang.*;
import java.util.*;

class StringMerge{
public static void main(String args[]){
String s1,s2;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string 1 : ");
s1 = sc.next();
System.out.print("Enter the string 2 : ");
s2 = sc.next();
int l1 = s1.length();
int l2 = s2.length();
int l3 = l1+l2;
char s3[] = new char[l3];
int i,j,max,min,k=0;
if(l1>=l2){
min = l2;
max = l1;}
else 
{
min = l1;
max = l2;
}
for(i = 0;i<min;i++){
s3[k]=s1.charAt(i);
k++;
s3[k] = s2.charAt(i);
k++;}
if(l1<l2){
for(int r = i;r<l2;r++){
s3[k] = s2.charAt(r);
k++;
}}
else if(l1>l2){
for(int r = i;r<l1;r++){
s3[k]=s2.charAt(r);
k++;}
}
System.out.print(s3);

}}


