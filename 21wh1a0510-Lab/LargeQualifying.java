package javalab;
import java.lang.*;
import java.util.*;
public class LargeQualifying {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
int c[] = new int[n];
int count =0;
for(int i=0;i<n;i++)
a[i]= sc.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i!=j) {
if(a[i]!=a[j]) {
c[i]=a[i];
}
else {
count++;
break;
}
}
}
}
int max = c[0];
if(count == n)
System.out.print("all are disqualified");
else if(count<n) {
for(int k=0;k<n;k++) {
if(max<c[k])
max=c[k];
}
System.out.print("Max element is: "+max);
}

}
}