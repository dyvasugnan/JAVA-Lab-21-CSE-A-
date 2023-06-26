import java.lang.*;
import java.util.Scanner;
class BubbleSort{
public static void bubblesort(int a[],int n){
int temp=0;
for(int i=0;i<a.length;i++){
for(int j=0;j<(a.length-i-1);j++){
if(a[j]>a[j+1]){
temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
}
}
public static void main(String args[]){
int n;
Scanner sc = new Scanner(System.in);
System.out.print("enter the number of elements : ");
n = sc.nextInt();
int a[] = new int[n];
System.out.print("enter the values : ");
for(int i=0;i<a.length;i++){
a[i] = sc.nextInt();
}
 System.out.print("before bubblesort :  ");
for(int i=0;i<a.length;i++){
System.out.print(" "+a[i]);
}
System.out.println(" ");
System.out.print("After sorting\n");
bubblesort(a,n);
for(int i=0;i<a.length;i++){
System.out.print(" "+a[i]);
}
}
}



