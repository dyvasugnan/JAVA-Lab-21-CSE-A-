import java.lang.*;
import java.util.Scanner;
class Test {
public static void main(String args[]){
int n,i,k,j=0 ;
int a[] = new int[100];
Scanner sc = new Scanner(System.in);
System.out.print("Enter the n value : ");
n = sc.nextInt();
for(i = 1;i<=n;i++){
for(k = 1;k<i;k++){
if((k+1)*k==i){
a[j] = i;
j++;}

}}
for(i = 0;i<j;i++)
System.out.println(a[i]);}}

